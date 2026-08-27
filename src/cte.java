public class cte extends crd {
   private static final float c = 0.05F;
   private static final float d = 0.1F;

   public cte(dex.d $$0) {
      super($$0, ic.a);
   }

   @Override
   public boolean d(dey $$0) {
      return false;
   }

   protected static boolean a(cpk $$0, cqi.c $$1) {
      if ($$1 == cqi.c.b) {
         return $$0.y_().i() < 0.05F;
      } else {
         return $$1 == cqi.c.c ? $$0.y_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, cqi.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cqi.c.b) {
            $$1.b($$2, csl.fu.n());
            $$1.a(null, dji.c, $$2);
         } else if ($$3 == cqi.c.c) {
            $$1.b($$2, csl.fw.n());
            $$1.a(null, dji.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eaa $$0) {
      return true;
   }

   @Override
   protected void a(dey $$0, cpk $$1, gv $$2, eaa $$3) {
      if ($$3 == eac.c) {
         dey $$4 = csl.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dji.c, $$2, dji.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eac.e) {
         dey $$5 = csl.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dji.c, $$2, dji.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
