public class ctz extends cuf {
   private static final int a = 40;

   public ctz(cuf.a $$0) {
      super($$0);
   }

   @Override
   public cuk a(cuk $$0, dbt $$1, btk $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof arc $$3) {
         am.A.a($$3, $$0);
         $$3.b(awg.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(brz.s);
      }

      if ($$0.e()) {
         return new cuk(cun.sl);
      } else {
         if ($$2 instanceof cms $$4 && !$$4.fP()) {
            cuk $$5 = new cuk(cun.sl);
            if (!$$4.gc().f($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(cuk $$0) {
      return 40;
   }

   @Override
   public cwf c(cuk $$0) {
      return cwf.c;
   }

   @Override
   public avv al_() {
      return avw.mD;
   }

   @Override
   public avv am_() {
      return avw.mD;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      return cum.a($$0, $$1, $$2);
   }
}
