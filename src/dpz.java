public class dpz extends dqa<dsl> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final hx an = hx.b;
   private final boolean ao;

   public static hx a(hx $$0) {
      return an.a((ja)$$0);
   }

   public dpz(boolean $$0) {
      super(dsl.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dqc<dsl> $$0) {
      hx $$1 = $$0.e();
      csz $$2 = $$0.b();

      for (hx $$3 : hx.a(new hx($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new hx($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, cvh.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, cvh.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, cvh.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, cvh.F.o());
            } else if (this.ao) {
               this.a($$2, new hx($$3), cvh.fx.o());
            } else {
               this.a($$2, new hx($$3), cvh.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), cvh.F.o());
      }

      hx $$6 = $$1.b(2);

      for (ib $$7 : ib.c.a) {
         this.a($$2, $$6.a($$7), cvh.cq.o().a(dee.g, $$7));
      }

      return true;
   }
}
