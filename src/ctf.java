public class ctf extends cre {
   private static final float c = 0.05F;
   private static final float d = 0.1F;

   public ctf(dey.d $$0) {
      super($$0, ib.a);
   }

   @Override
   public boolean d(dez $$0) {
      return false;
   }

   protected static boolean a(cpl $$0, cqj.c $$1) {
      if ($$1 == cqj.c.b) {
         return $$0.y_().i() < 0.05F;
      } else {
         return $$1 == cqj.c.c ? $$0.y_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, cqj.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cqj.c.b) {
            $$1.b($$2, csm.fu.n());
            $$1.a(null, djj.c, $$2);
         } else if ($$3 == cqj.c.c) {
            $$1.b($$2, csm.fw.n());
            $$1.a(null, djj.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eab $$0) {
      return true;
   }

   @Override
   protected void a(dez $$0, cpl $$1, gu $$2, eab $$3) {
      if ($$3 == ead.c) {
         dez $$4 = csm.fu.n();
         $$1.b($$2, $$4);
         $$1.a(djj.c, $$2, djj.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ead.e) {
         dez $$5 = csm.fv.n();
         $$1.b($$2, $$5);
         $$1.a(djj.c, $$2, djj.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
