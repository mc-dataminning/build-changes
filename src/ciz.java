public class ciz extends cjg {
   private static final int a = 40;

   public ciz(cjg.a $$0) {
      super($$0);
   }

   @Override
   public cjl a(cjl $$0, cqb $$1, bjm $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof aku $$3) {
         al.z.a($$3, $$0);
         $$3.b(apq.c.b(this));
      }

      if (!$$1.B) {
         $$2.d(bil.s);
      }

      if ($$0.b()) {
         return new cjl(cjo.rw);
      } else {
         if ($$2 instanceof cca $$4 && !$$4.fT().d) {
            cjl $$5 = new cjl(cjo.rw);
            if (!$$4.fS().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(cjl $$0) {
      return 40;
   }

   @Override
   public cle c(cjl $$0) {
      return cle.c;
   }

   @Override
   public apf aj_() {
      return apg.lb;
   }

   @Override
   public apf ak_() {
      return apg.lb;
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      return cjn.a($$0, $$1, $$2);
   }
}
