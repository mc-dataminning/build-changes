public class edt extends edu<egf> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final jf ao = jf.c;
   private final boolean ap;

   public static jf a(jf $$0) {
      return ao.a((kj)$$0);
   }

   public edt(boolean $$0) {
      super(egf.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(edw<egf> $$0) {
      jf $$1 = $$0.e();
      dfg $$2 = $$0.b();

      for (jf $$3 : jf.c(new jf($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new jf($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dho.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dho.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dho.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, dho.F.n());
            } else if (this.ap) {
               this.a($$2, new jf($$3), dho.fx.n());
            } else {
               this.a($$2, new jf($$3), dho.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dho.F.n());
      }

      jf $$6 = $$1.b(2);

      for (jk $$7 : jk.c.a) {
         this.a($$2, $$6.a($$7), dho.cq.n().b(dqp.g, $$7));
      }

      return true;
   }
}
