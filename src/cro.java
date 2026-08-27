import java.util.Map;

public abstract class cro extends csv {
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 3;
   private static final int f = 2;
   protected static final int a = 4;
   private static final eig g = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eig b = eid.a(
      eid.b(), eid.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), g), ehr.e
   );
   private final Map<cja, id> h;

   public cro(dfi.d $$0, Map<cja, id> $$1) {
      super($$0);
      this.h = $$1;
   }

   protected double b(dfj $$0) {
      return 0.0;
   }

   protected boolean a(dfj $$0, gw $$1, biq $$2) {
      return $$2.ds() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      id $$7 = this.h.get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2) {
      return g;
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   public abstract boolean d(dfj var1);

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      gw $$4 = cyl.a((cpv)$$1, $$2);
      if ($$4 != null) {
         eal $$5 = cyl.a($$1, $$4);
         if ($$5 != ean.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eal $$0) {
      return false;
   }

   protected void a(dfj $$0, cpv $$1, gw $$2, eal $$3) {
   }
}
