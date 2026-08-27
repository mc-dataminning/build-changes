public class ctk extends crj {
   private static final float c = 0.05F;
   private static final float d = 0.1F;

   public ctk(dfd.d $$0) {
      super($$0, id.a);
   }

   @Override
   public boolean d(dfe $$0) {
      return false;
   }

   protected static boolean a(cpq $$0, cqo.c $$1) {
      if ($$1 == cqo.c.b) {
         return $$0.y_().i() < 0.05F;
      } else {
         return $$1 == cqo.c.c ? $$0.y_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, cqo.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cqo.c.b) {
            $$1.b($$2, csr.fu.n());
            $$1.a(null, djo.c, $$2);
         } else if ($$3 == cqo.c.c) {
            $$1.b($$2, csr.fw.n());
            $$1.a(null, djo.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eag $$0) {
      return true;
   }

   @Override
   protected void a(dfe $$0, cpq $$1, gw $$2, eag $$3) {
      if ($$3 == eai.c) {
         dfe $$4 = csr.fu.n();
         $$1.b($$2, $$4);
         $$1.a(djo.c, $$2, djo.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eai.e) {
         dfe $$5 = csr.fv.n();
         $$1.b($$2, $$5);
         $$1.a(djo.c, $$2, djo.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
