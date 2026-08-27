public class cmz extends cmm {
   private static final int a = 32;

   public cmz(cmm.a $$0) {
      super($$0);
   }

   @Override
   public cmr a(cmr $$0, cti $$1, bmf $$2) {
      if ($$2 instanceof ana $$3) {
         am.A.a($$3, $$0);
         $$3.b(arw.c.b(this));
      }

      if ($$2 instanceof cfb && !((cfb)$$2).fT().d) {
         $$0.h(1);
      }

      if (!$$1.B) {
         $$2.er();
      }

      return $$0.b() ? new cmr(cmu.qv) : $$0;
   }

   @Override
   public int b(cmr $$0) {
      return 32;
   }

   @Override
   public cok c(cmr $$0) {
      return cok.c;
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      return cmt.a($$0, $$1, $$2);
   }
}
