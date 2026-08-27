import java.util.Map;

public abstract class cre extends csl {
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 3;
   private static final int f = 2;
   protected static final int a = 4;
   private static final ehw g = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ehw b = eht.a(
      eht.b(), eht.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), g), ehh.e
   );
   private final Map<cis, ib> h;

   public cre(dey.d $$0, Map<cis, ib> $$1) {
      super($$0);
      this.h = $$1;
   }

   protected double b(dez $$0) {
      return 0.0;
   }

   protected boolean a(dez $$0, gu $$1, bii $$2) {
      return $$2.dr() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      cix $$6 = $$3.b($$4);
      ib $$7 = this.h.get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2) {
      return g;
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   public abstract boolean d(dez var1);

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      gu $$4 = cyb.a((cpl)$$1, $$2);
      if ($$4 != null) {
         eab $$5 = cyb.a($$1, $$4);
         if ($$5 != ead.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eab $$0) {
      return false;
   }

   protected void a(dez $$0, cpl $$1, gu $$2, eab $$3) {
   }
}
