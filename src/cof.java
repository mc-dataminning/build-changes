import java.util.Map;

public abstract class cof extends cpn {
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 3;
   private static final int f = 2;
   protected static final int a = 4;
   private static final efb g = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final efb b = eey.a(
      eey.b(), eey.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), g), eem.e
   );
   private final Map<cfu, ib> h;

   public cof(dca.d $$0, Map<cfu, ib> $$1) {
      super($$0);
      this.h = $$1;
   }

   protected double b(dcb $$0) {
      return 0.0;
   }

   protected boolean a(dcb $$0, gu $$1, bfj $$2) {
      return $$2.dp() < (double)$$1.v() + this.b($$0) && $$2.cE().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      cfz $$6 = $$3.b($$4);
      ib $$7 = this.h.get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2) {
      return g;
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   public abstract boolean d(dcb var1);

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      gu $$4 = cvd.a((cmm)$$1, $$2);
      if ($$4 != null) {
         dxd $$5 = cvd.a($$1, $$4);
         if ($$5 != dxf.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(dxd $$0) {
      return false;
   }

   protected void a(dcb $$0, cmm $$1, gu $$2, dxd $$3) {
   }
}
