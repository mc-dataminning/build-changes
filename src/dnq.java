public class dnq extends dnr<dqc> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final gw an = gw.b;
   private final boolean ao;

   public static gw a(gw $$0) {
      return an.a((ib)$$0);
   }

   public dnq(boolean $$0) {
      super(dqc.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dnt<dqc> $$0) {
      gw $$1 = $$0.e();
      cqk $$2 = $$0.b();

      for (gw $$3 : gw.a(new gw($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new gw($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, csr.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, csr.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, csr.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, csr.F.n());
            } else if (this.ao) {
               this.a($$2, new gw($$3), csr.fx.n());
            } else {
               this.a($$2, new gw($$3), csr.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), csr.F.n());
      }

      gw $$6 = $$1.b(2);

      for (hc $$7 : hc.c.a) {
         this.a($$2, $$6.a($$7), csr.cq.n().a(dbq.a, $$7));
      }

      return true;
   }
}
