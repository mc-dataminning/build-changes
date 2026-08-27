public class ckp extends ckw {
   private static final int a = 40;

   public ckp(ckw.a $$0) {
      super($$0);
   }

   @Override
   public clb a(clb $$0, crs $$1, bky $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof amb $$3) {
         al.z.a($$3, $$0);
         $$3.b(aqx.c.b(this));
      }

      if (!$$1.B) {
         $$2.d(bjx.s);
      }

      if ($$0.b()) {
         return new clb(cle.rx);
      } else {
         if ($$2 instanceof cdm $$4 && !$$4.fT().d) {
            clb $$5 = new clb(cle.rx);
            if (!$$4.fS().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(clb $$0) {
      return 40;
   }

   @Override
   public cmu c(clb $$0) {
      return cmu.c;
   }

   @Override
   public aqm am_() {
      return aqn.lf;
   }

   @Override
   public aqm an_() {
      return aqn.lf;
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      return cld.a($$0, $$1, $$2);
   }
}
