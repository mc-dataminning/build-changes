import java.util.Map;

public abstract class crq extends csx {
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 3;
   private static final int f = 2;
   protected static final int a = 4;
   private static final eii g = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eii b = eif.a(
      eif.b(), eif.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), g), eht.e
   );
   private final Map<cjc, id> h;

   public crq(dfk.d $$0, Map<cjc, id> $$1) {
      super($$0);
      this.h = $$1;
   }

   protected double b(dfl $$0) {
      return 0.0;
   }

   protected boolean a(dfl $$0, gw $$1, bis $$2) {
      return $$2.ds() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      id $$7 = this.h.get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2) {
      return g;
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   public abstract boolean d(dfl var1);

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      gw $$4 = cyn.a((cpx)$$1, $$2);
      if ($$4 != null) {
         ean $$5 = cyn.a($$1, $$4);
         if ($$5 != eap.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ean $$0) {
      return false;
   }

   protected void a(dfl $$0, cpx $$1, gw $$2, ean $$3) {
   }
}
