import java.util.Map;

public abstract class crd extends csk {
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 3;
   private static final int f = 2;
   protected static final int a = 4;
   private static final ehy g = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ehy b = ehv.a(
      ehv.b(), ehv.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), g), ehj.e
   );
   private final Map<cir, ic> h;

   public crd(dex.d $$0, Map<cir, ic> $$1) {
      super($$0);
      this.h = $$1;
   }

   protected double b(dey $$0) {
      return 0.0;
   }

   protected boolean a(dey $$0, gv $$1, big $$2) {
      return $$2.dr() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      ic $$7 = this.h.get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2) {
      return g;
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   public abstract boolean d(dey var1);

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      gv $$4 = cya.a((cpk)$$1, $$2);
      if ($$4 != null) {
         eaa $$5 = cya.a($$1, $$4);
         if ($$5 != eac.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eaa $$0) {
      return false;
   }

   protected void a(dey $$0, cpk $$1, gv $$2, eaa $$3) {
   }
}
