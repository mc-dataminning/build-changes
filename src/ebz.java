public class ebz extends eca<eel> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final jd an = jd.c;
   private final boolean ao;

   public static jd a(jd $$0) {
      return an.a((kh)$$0);
   }

   public ebz(boolean $$0) {
      super(eel.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(ecc<eel> $$0) {
      jd $$1 = $$0.e();
      ddq $$2 = $$0.b();

      for (jd $$3 : jd.c(new jd($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new jd($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dfy.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dfy.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dfy.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, dfy.F.o());
            } else if (this.ao) {
               this.a($$2, new jd($$3), dfy.fx.o());
            } else {
               this.a($$2, new jd($$3), dfy.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dfy.F.o());
      }

      jd $$6 = $$1.b(2);

      for (ji $$7 : ji.c.a) {
         this.a($$2, $$6.a($$7), dfy.cq.o().a(doz.g, $$7));
      }

      return true;
   }
}
