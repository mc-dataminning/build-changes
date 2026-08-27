import com.mojang.serialization.MapCodec;

public abstract class cru extends ctc {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eia h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eia b = ehx.a(
      ehx.b(), ehx.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ehl.e
   );
   protected final ia.a c;

   @Override
   protected abstract MapCodec<? extends cru> a();

   public cru(dfc.d $$0, ia.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dfd $$0) {
      return 0.0;
   }

   protected boolean a(dfd $$0, gw $$1, biw $$2) {
      return $$2.ds() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      ia $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2) {
      return h;
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   public abstract boolean d(dfd var1);

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      gw $$4 = cys.a((cqb)$$1, $$2);
      if ($$4 != null) {
         eaf $$5 = cys.a($$1, $$4);
         if ($$5 != eah.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eaf $$0) {
      return false;
   }

   protected void a(dfd $$0, cqb $$1, gw $$2, eaf $$3) {
   }
}
