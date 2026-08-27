public class ctp extends cro {
   private static final float c = 0.05F;
   private static final float d = 0.1F;

   public ctp(dfi.d $$0) {
      super($$0, id.a);
   }

   @Override
   public boolean d(dfj $$0) {
      return false;
   }

   protected static boolean a(cpv $$0, cqt.c $$1) {
      if ($$1 == cqt.c.b) {
         return $$0.D_().i() < 0.05F;
      } else {
         return $$1 == cqt.c.c ? $$0.D_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, cqt.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cqt.c.b) {
            $$1.b($$2, csw.fu.n());
            $$1.a(null, djt.c, $$2);
         } else if ($$3 == cqt.c.c) {
            $$1.b($$2, csw.fw.n());
            $$1.a(null, djt.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eal $$0) {
      return true;
   }

   @Override
   protected void a(dfj $$0, cpv $$1, gw $$2, eal $$3) {
      if ($$3 == ean.c) {
         dfj $$4 = csw.fu.n();
         $$1.b($$2, $$4);
         $$1.a(djt.c, $$2, djt.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ean.e) {
         dfj $$5 = csw.fv.n();
         $$1.b($$2, $$5);
         $$1.a(djt.c, $$2, djt.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
