public class dyt extends dyu<ebf> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final im an = im.c;
   private final boolean ao;

   public static im a(im $$0) {
      return an.a((jq)$$0);
   }

   public dyt(boolean $$0) {
      super(ebf.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dyw<ebf> $$0) {
      im $$1 = $$0.e();
      dap $$2 = $$0.b();

      for (im $$3 : im.c(new im($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new im($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dcx.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dcx.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dcx.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, dcx.F.n());
            } else if (this.ao) {
               this.a($$2, new im($$3), dcx.fx.n());
            } else {
               this.a($$2, new im($$3), dcx.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dcx.F.n());
      }

      im $$6 = $$1.b(2);

      for (ir $$7 : ir.c.a) {
         this.a($$2, $$6.a($$7), dcx.cq.n().a(dlx.g, $$7));
      }

      return true;
   }
}
