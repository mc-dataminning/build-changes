public class ctr extends crq {
   private static final float c = 0.05F;
   private static final float d = 0.1F;

   public ctr(dfk.d $$0) {
      super($$0, id.a);
   }

   @Override
   public boolean d(dfl $$0) {
      return false;
   }

   protected static boolean a(cpx $$0, cqv.c $$1) {
      if ($$1 == cqv.c.b) {
         return $$0.D_().i() < 0.05F;
      } else {
         return $$1 == cqv.c.c ? $$0.D_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, cqv.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cqv.c.b) {
            $$1.b($$2, csy.fu.n());
            $$1.a(null, djv.c, $$2);
         } else if ($$3 == cqv.c.c) {
            $$1.b($$2, csy.fw.n());
            $$1.a(null, djv.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ean $$0) {
      return true;
   }

   @Override
   protected void a(dfl $$0, cpx $$1, gw $$2, ean $$3) {
      if ($$3 == eap.c) {
         dfl $$4 = csy.fu.n();
         $$1.b($$2, $$4);
         $$1.a(djv.c, $$2, djv.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eap.e) {
         dfl $$5 = csy.fv.n();
         $$1.b($$2, $$5);
         $$1.a(djv.c, $$2, djv.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
