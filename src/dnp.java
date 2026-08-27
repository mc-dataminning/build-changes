public class dnp extends dnq<dqb> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final gw an = gw.b;
   private final boolean ao;

   public static gw a(gw $$0) {
      return an.a((hy)$$0);
   }

   public dnp(boolean $$0) {
      super(dqb.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dns<dqb> $$0) {
      gw $$1 = $$0.e();
      cqv $$2 = $$0.b();

      for (gw $$3 : gw.a(new gw($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new gw($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, cte.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, cte.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, cte.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, cte.F.o());
            } else if (this.ao) {
               this.a($$2, new gw($$3), cte.fx.o());
            } else {
               this.a($$2, new gw($$3), cte.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), cte.F.o());
      }

      gw $$6 = $$1.b(2);

      for (ha $$7 : ha.c.a) {
         this.a($$2, $$6.a($$7), cte.cq.o().a(dbz.g, $$7));
      }

      return true;
   }
}
