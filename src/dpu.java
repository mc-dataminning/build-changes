public class dpu extends dpv<dsg> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final ht an = ht.b;
   private final boolean ao;

   public static ht a(ht $$0) {
      return an.a((iw)$$0);
   }

   public dpu(boolean $$0) {
      super(dsg.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dpx<dsg> $$0) {
      ht $$1 = $$0.e();
      csu $$2 = $$0.b();

      for (ht $$3 : ht.a(new ht($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new ht($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, cvc.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, cvc.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, cvc.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, cvc.F.o());
            } else if (this.ao) {
               this.a($$2, new ht($$3), cvc.fx.o());
            } else {
               this.a($$2, new ht($$3), cvc.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), cvc.F.o());
      }

      ht $$6 = $$1.b(2);

      for (hx $$7 : hx.c.a) {
         this.a($$2, $$6.a($$7), cvc.cq.o().a(ddz.g, $$7));
      }

      return true;
   }
}
