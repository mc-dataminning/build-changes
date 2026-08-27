public class cit extends cja {
   private static final int a = 40;

   public cit(cja.a $$0) {
      super($$0);
   }

   @Override
   public cjf a(cjf $$0, cpv $$1, bjg $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof aks $$3) {
         al.z.a($$3, $$0);
         $$3.b(apo.c.b(this));
      }

      if (!$$1.B) {
         $$2.d(bif.s);
      }

      if ($$0.b()) {
         return new cjf(cji.rw);
      } else {
         if ($$2 instanceof cbu $$4 && !$$4.fS().d) {
            cjf $$5 = new cjf(cji.rw);
            if (!$$4.fR().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(cjf $$0) {
      return 40;
   }

   @Override
   public cky c(cjf $$0) {
      return cky.c;
   }

   @Override
   public apd aj_() {
      return ape.lb;
   }

   @Override
   public apd ak_() {
      return ape.lb;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      return cjh.a($$0, $$1, $$2);
   }
}
