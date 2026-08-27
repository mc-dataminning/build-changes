public class cqh extends cof {
   private static final float c = 0.05F;
   private static final float d = 0.1F;

   public cqh(dca.d $$0) {
      super($$0, ib.a);
   }

   @Override
   public boolean d(dcb $$0) {
      return false;
   }

   protected static boolean a(cmm $$0, cnk.c $$1) {
      if ($$1 == cnk.c.b) {
         return $$0.y_().i() < 0.05F;
      } else {
         return $$1 == cnk.c.c ? $$0.y_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cnk.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cnk.c.b) {
            $$1.b($$2, cpo.fu.n());
            $$1.a(null, dgl.c, $$2);
         } else if ($$3 == cnk.c.c) {
            $$1.b($$2, cpo.fw.n());
            $$1.a(null, dgl.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(dxd $$0) {
      return true;
   }

   @Override
   protected void a(dcb $$0, cmm $$1, gu $$2, dxd $$3) {
      if ($$3 == dxf.c) {
         dcb $$4 = cpo.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dgl.c, $$2, dgl.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == dxf.e) {
         dcb $$5 = cpo.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dgl.c, $$2, dgl.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
