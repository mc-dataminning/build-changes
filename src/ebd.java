public class ebd extends ebe<edp> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final ja an = ja.c;
   private final boolean ao;

   public static ja a(ja $$0) {
      return an.a((ke)$$0);
   }

   public ebd(boolean $$0) {
      super(edp.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(ebg<edp> $$0) {
      ja $$1 = $$0.e();
      dcz $$2 = $$0.b();

      for (ja $$3 : ja.c(new ja($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new ja($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dfh.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dfh.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dfh.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, dfh.F.o());
            } else if (this.ao) {
               this.a($$2, new ja($$3), dfh.fx.o());
            } else {
               this.a($$2, new ja($$3), dfh.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dfh.F.o());
      }

      ja $$6 = $$1.b(2);

      for (jf $$7 : jf.c.a) {
         this.a($$2, $$6.a($$7), dfh.cq.o().a(doh.g, $$7));
      }

      return true;
   }
}
