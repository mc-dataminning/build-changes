public class cjn extends cja {
   private static final int a = 32;

   public cjn(cja.a $$0) {
      super($$0);
   }

   @Override
   public cjf a(cjf $$0, cpv $$1, bjg $$2) {
      if ($$2 instanceof aks $$3) {
         al.z.a($$3, $$0);
         $$3.b(apo.c.b(this));
      }

      if ($$2 instanceof cbu && !((cbu)$$2).fS().d) {
         $$0.h(1);
      }

      if (!$$1.B) {
         $$2.eq();
      }

      return $$0.b() ? new cjf(cji.pK) : $$0;
   }

   @Override
   public int b(cjf $$0) {
      return 32;
   }

   @Override
   public cky c(cjf $$0) {
      return cky.c;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      return cjh.a($$0, $$1, $$2);
   }
}
