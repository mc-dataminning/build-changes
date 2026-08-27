public class dvp extends dvq<dyb> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final ib an = ib.c;
   private final boolean ao;

   public static ib a(ib $$0) {
      return an.a((jg)$$0);
   }

   public dvp(boolean $$0) {
      super(dyb.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dvs<dyb> $$0) {
      ib $$1 = $$0.e();
      cxu $$2 = $$0.b();

      for (ib $$3 : ib.a(new ib($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new ib($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dac.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dac.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dac.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, dac.F.o());
            } else if (this.ao) {
               this.a($$2, new ib($$3), dac.fx.o());
            } else {
               this.a($$2, new ib($$3), dac.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dac.F.o());
      }

      ib $$6 = $$1.b(2);

      for (ih $$7 : ih.c.a) {
         this.a($$2, $$6.a($$7), dac.cq.o().a(djb.g, $$7));
      }

      return true;
   }
}
