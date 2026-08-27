public class cpz extends cqf {
   private static final int a = 40;

   public cpz(cqf.a $$0) {
      super($$0);
   }

   @Override
   public cqk a(cqk $$0, cwz $$1, bpo $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof apg $$3) {
         am.A.a($$3, $$0);
         $$3.b(aui.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(bol.s);
      }

      if ($$0.b()) {
         return new cqk(cqn.sk);
      } else {
         if ($$2 instanceof cis $$4 && !$$4.fM()) {
            cqk $$5 = new cqk(cqn.sk);
            if (!$$4.fZ().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(cqk $$0) {
      return 40;
   }

   @Override
   public csd c(cqk $$0) {
      return csd.c;
   }

   @Override
   public atx an_() {
      return aty.mi;
   }

   @Override
   public atx ao_() {
      return aty.mi;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      return cqm.a($$0, $$1, $$2);
   }
}
