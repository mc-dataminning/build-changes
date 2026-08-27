public class cqy extends cre {
   private static final int a = 40;

   public cqy(cre.a $$0) {
      super($$0);
   }

   @Override
   public crj a(crj $$0, cyx $$1, bqo $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof apt $$3) {
         am.A.a($$3, $$0);
         $$3.b(auw.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(bpj.s);
      }

      if ($$0.d()) {
         return new crj(crm.sk);
      } else {
         if ($$2 instanceof cjt $$4 && !$$4.fM()) {
            crj $$5 = new crj(crm.sk);
            if (!$$4.fZ().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(crj $$0) {
      return 40;
   }

   @Override
   public ctb c(crj $$0) {
      return ctb.c;
   }

   @Override
   public aul al_() {
      return aum.mo;
   }

   @Override
   public aul am_() {
      return aum.mo;
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      return crl.a($$0, $$1, $$2);
   }
}
