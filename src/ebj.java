public class ebj extends ebk<edv> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final ja an = ja.c;
   private final boolean ao;

   public static ja a(ja $$0) {
      return an.a((ke)$$0);
   }

   public ebj(boolean $$0) {
      super(edv.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(ebm<edv> $$0) {
      ja $$1 = $$0.e();
      ddb $$2 = $$0.b();

      for (ja $$3 : ja.c(new ja($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new ja($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dfj.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dfj.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dfj.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, dfj.F.o());
            } else if (this.ao) {
               this.a($$2, new ja($$3), dfj.fx.o());
            } else {
               this.a($$2, new ja($$3), dfj.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dfj.F.o());
      }

      ja $$6 = $$1.b(2);

      for (jf $$7 : jf.c.a) {
         this.a($$2, $$6.a($$7), dfj.cq.o().a(doj.g, $$7));
      }

      return true;
   }
}
