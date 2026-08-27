public class crs extends cry {
   private static final int a = 40;

   public crs(cry.a $$0) {
      super($$0);
   }

   @Override
   public csd a(csd $$0, czu $$1, bre $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof aqf $$3) {
         am.A.a($$3, $$0);
         $$3.b(avj.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(bpz.s);
      }

      if ($$0.d()) {
         return new csd(csg.sl);
      } else {
         if ($$2 instanceof ckl $$4 && !$$4.fN()) {
            csd $$5 = new csd(csg.sl);
            if (!$$4.ga().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(csd $$0) {
      return 40;
   }

   @Override
   public ctw c(csd $$0) {
      return ctw.c;
   }

   @Override
   public auy ak_() {
      return auz.mt;
   }

   @Override
   public auy al_() {
      return auz.mt;
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      return csf.a($$0, $$1, $$2);
   }
}
