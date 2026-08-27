import com.mojang.serialization.MapCodec;

public class cxs extends daz {
   public static final MapCodec<cxs> a = b(cxs::new);

   @Override
   public MapCodec<cxs> a() {
      return a;
   }

   public cxs(djg.d $$0) {
      super($$0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         hx $$4 = $$2.d();
         djh $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ic.b)) {
            aur.a($$1, $$2, $$3, jx.F);
         }
      }
   }
}
