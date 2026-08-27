public class dsb extends dsc<dun> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final hx an = hx.b;
   private final boolean ao;

   public static hx a(hx $$0) {
      return an.a((jb)$$0);
   }

   public dsb(boolean $$0) {
      super(dun.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dse<dun> $$0) {
      hx $$1 = $$0.e();
      cus $$2 = $$0.b();

      for (hx $$3 : hx.a(new hx($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new hx($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, cxa.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, cxa.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, cxa.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, cxa.F.o());
            } else if (this.ao) {
               this.a($$2, new hx($$3), cxa.fx.o());
            } else {
               this.a($$2, new hx($$3), cxa.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), cxa.F.o());
      }

      hx $$6 = $$1.b(2);

      for (ic $$7 : ic.c.a) {
         this.a($$2, $$6.a($$7), cxa.cq.o().a(dfy.g, $$7));
      }

      return true;
   }
}
