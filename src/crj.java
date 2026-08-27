import java.util.Map;

public abstract class crj extends csq {
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 3;
   private static final int f = 2;
   protected static final int a = 4;
   private static final eib g = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eib b = ehy.a(
      ehy.b(), ehy.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), g), ehm.e
   );
   private final Map<civ, id> h;

   public crj(dfd.d $$0, Map<civ, id> $$1) {
      super($$0);
      this.h = $$1;
   }

   protected double b(dfe $$0) {
      return 0.0;
   }

   protected boolean a(dfe $$0, gw $$1, bil $$2) {
      return $$2.dr() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cja $$6 = $$3.b($$4);
      id $$7 = this.h.get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2) {
      return g;
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   public abstract boolean d(dfe var1);

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      gw $$4 = cyg.a((cpq)$$1, $$2);
      if ($$4 != null) {
         eag $$5 = cyg.a($$1, $$4);
         if ($$5 != eai.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eag $$0) {
      return false;
   }

   protected void a(dfe $$0, cpq $$1, gw $$2, eag $$3) {
   }
}
