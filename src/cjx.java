public class cjx extends cke {
   private static final int a = 40;

   public cjx(cke.a $$0) {
      super($$0);
   }

   @Override
   public ckj a(ckj $$0, cqz $$1, bkj $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof alr $$3) {
         al.z.a($$3, $$0);
         $$3.b(aqn.c.b(this));
      }

      if (!$$1.B) {
         $$2.d(bji.s);
      }

      if ($$0.b()) {
         return new ckj(ckm.rw);
      } else {
         if ($$2 instanceof ccx $$4 && !$$4.fT().d) {
            ckj $$5 = new ckj(ckm.rw);
            if (!$$4.fS().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(ckj $$0) {
      return 40;
   }

   @Override
   public cmc c(ckj $$0) {
      return cmc.c;
   }

   @Override
   public aqc am_() {
      return aqd.ld;
   }

   @Override
   public aqc an_() {
      return aqd.ld;
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      return ckl.a($$0, $$1, $$2);
   }
}
