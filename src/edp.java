public class edp extends edq<egb> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final je ao = je.c;
   private final boolean ap;

   public static je a(je $$0) {
      return ao.a((ki)$$0);
   }

   public edp(boolean $$0) {
      super(egb.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(eds<egb> $$0) {
      je $$1 = $$0.e();
      dfd $$2 = $$0.b();

      for (je $$3 : je.c(new je($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new je($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dhl.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dhl.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dhl.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, dhl.F.o());
            } else if (this.ap) {
               this.a($$2, new je($$3), dhl.fx.o());
            } else {
               this.a($$2, new je($$3), dhl.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dhl.F.o());
      }

      je $$6 = $$1.b(2);

      for (jj $$7 : jj.c.a) {
         this.a($$2, $$6.a($$7), dhl.cq.o().b(dqm.g, $$7));
      }

      return true;
   }
}
