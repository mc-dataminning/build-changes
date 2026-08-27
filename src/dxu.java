public class dxu extends dxv<eag> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final ib an = ib.c;
   private final boolean ao;

   public static ib a(ib $$0) {
      return an.a((jg)$$0);
   }

   public dxu(boolean $$0) {
      super(eag.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dxx<eag> $$0) {
      ib $$1 = $$0.e();
      czs $$2 = $$0.b();

      for (ib $$3 : ib.a(new ib($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new ib($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dca.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dca.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dca.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, dca.F.n());
            } else if (this.ao) {
               this.a($$2, new ib($$3), dca.fx.n());
            } else {
               this.a($$2, new ib($$3), dca.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dca.F.n());
      }

      ib $$6 = $$1.b(2);

      for (ih $$7 : ih.c.a) {
         this.a($$2, $$6.a($$7), dca.cq.n().a(dkz.g, $$7));
      }

      return true;
   }
}
