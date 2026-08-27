public class dzc extends dzd<ebo> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final in an = in.c;
   private final boolean ao;

   public static in a(in $$0) {
      return an.a((jr)$$0);
   }

   public dzc(boolean $$0) {
      super(ebo.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      in $$1 = $$0.e();
      day $$2 = $$0.b();

      for (in $$3 : in.c(new in($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new in($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, ddg.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, ddg.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, ddg.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, ddg.F.n());
            } else if (this.ao) {
               this.a($$2, new in($$3), ddg.fx.n());
            } else {
               this.a($$2, new in($$3), ddg.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), ddg.F.n());
      }

      in $$6 = $$1.b(2);

      for (is $$7 : is.c.a) {
         this.a($$2, $$6.a($$7), ddg.cq.n().a(dmg.g, $$7));
      }

      return true;
   }
}
