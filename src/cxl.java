import com.mojang.serialization.MapCodec;

public class cxl extends das {
   public static final MapCodec<cxl> a = b(cxl::new);

   @Override
   public MapCodec<cxl> a() {
      return a;
   }

   public cxl(diz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         hx $$4 = $$2.d();
         dja $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ic.b)) {
            aul.a($$1, $$2, $$3, jx.F);
         }
      }
   }
}
