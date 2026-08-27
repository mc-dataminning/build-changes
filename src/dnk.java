public class dnk extends dnl<dpw> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final gv an = gv.b;
   private final boolean ao;

   public static gv a(gv $$0) {
      return an.a((ia)$$0);
   }

   public dnk(boolean $$0) {
      super(dpw.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      gv $$1 = $$0.e();
      cqe $$2 = $$0.b();

      for (gv $$3 : gv.a(new gv($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new gv($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, csl.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, csl.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, csl.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, csl.F.n());
            } else if (this.ao) {
               this.a($$2, new gv($$3), csl.fx.n());
            } else {
               this.a($$2, new gv($$3), csl.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), csl.F.n());
      }

      gv $$6 = $$1.b(2);

      for (hb $$7 : hb.c.a) {
         this.a($$2, $$6.a($$7), csl.cq.n().a(dbk.a, $$7));
      }

      return true;
   }
}
