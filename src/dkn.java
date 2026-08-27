public class dkn extends dko<dmz> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final gu an = gu.b;
   private final boolean ao;

   public static gu a(gu $$0) {
      return an.a((hz)$$0);
   }

   public dkn(boolean $$0) {
      super(dmz.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dkq<dmz> $$0) {
      gu $$1 = $$0.e();
      cng $$2 = $$0.b();

      for (gu $$3 : gu.a(new gu($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new gu($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, cpo.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, cpo.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, cpo.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, cpo.F.n());
            } else if (this.ao) {
               this.a($$2, new gu($$3), cpo.fx.n());
            } else {
               this.a($$2, new gu($$3), cpo.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), cpo.F.n());
      }

      gu $$6 = $$1.b(2);

      for (ha $$7 : ha.c.a) {
         this.a($$2, $$6.a($$7), cpo.cq.n().a(cyn.a, $$7));
      }

      return true;
   }
}
