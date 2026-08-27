import com.mojang.serialization.MapCodec;

public class cxr extends day {
   public static final MapCodec<cxr> a = b(cxr::new);

   @Override
   public MapCodec<cxr> a() {
      return a;
   }

   public cxr(djf.d $$0) {
      super($$0);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         hx $$4 = $$2.d();
         djg $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ic.b)) {
            auq.a($$1, $$2, $$3, jx.F);
         }
      }
   }
}
