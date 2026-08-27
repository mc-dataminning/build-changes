public class crb extends coy {
   private final cpn d;
   protected static final float a = 6.0F;
   protected static final efb b = cpn.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   protected crb(cpn $$0, dca.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      this.a($$0, (cmn)$$1, $$2);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.d.n().a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.a && !$$0.a($$3, $$4)) {
         return cpo.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(c)) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b;
   }
}
