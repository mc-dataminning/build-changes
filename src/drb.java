public class drb extends drc<dtn> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final hv an = hv.b;
   private final boolean ao;

   public static hv a(hv $$0) {
      return an.a((iz)$$0);
   }

   public drb(boolean $$0) {
      super(dtn.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      hv $$1 = $$0.e();
      ctt $$2 = $$0.b();

      for (hv $$3 : hv.a(new hv($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new hv($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, cwb.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, cwb.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, cwb.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, cwb.F.o());
            } else if (this.ao) {
               this.a($$2, new hv($$3), cwb.fx.o());
            } else {
               this.a($$2, new hv($$3), cwb.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), cwb.F.o());
      }

      hv $$6 = $$1.b(2);

      for (ia $$7 : ia.c.a) {
         this.a($$2, $$6.a($$7), cwb.cq.o().a(dez.g, $$7));
      }

      return true;
   }
}
