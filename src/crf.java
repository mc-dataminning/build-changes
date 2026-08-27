import java.util.Map;

public abstract class crf extends csm {
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 3;
   private static final int f = 2;
   protected static final int a = 4;
   private static final ehx g = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ehx b = ehu.a(
      ehu.b(), ehu.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), g), ehi.e
   );
   private final Map<cit, ib> h;

   public crf(dez.d $$0, Map<cit, ib> $$1) {
      super($$0);
      this.h = $$1;
   }

   protected double b(dfa $$0) {
      return 0.0;
   }

   protected boolean a(dfa $$0, gu $$1, bii $$2) {
      return $$2.dr() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      ib $$7 = this.h.get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2) {
      return g;
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   public abstract boolean d(dfa var1);

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      gu $$4 = cyc.a((cpm)$$1, $$2);
      if ($$4 != null) {
         eac $$5 = cyc.a($$1, $$4);
         if ($$5 != eae.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eac $$0) {
      return false;
   }

   protected void a(dfa $$0, cpm $$1, gu $$2, eac $$3) {
   }
}
