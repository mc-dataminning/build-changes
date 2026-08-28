import com.mojang.serialization.MapCodec;

public abstract class ddr extends dey {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ewj h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ewj b = ewg.a(
      ewg.b(), ewg.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), evu.e
   );
   protected final kf.a c;

   @Override
   protected abstract MapCodec<? extends ddr> a();

   public ddr(dsa.d $$0, kf.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dsb $$0) {
      return 0.0;
   }

   protected boolean a(dsb $$0, iz $$1, bst $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cK().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      kf $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2) {
      return h;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   public abstract boolean d(dsb var1);

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      iz $$4 = dkq.a((dbx)$$1, $$2);
      if ($$4 != null) {
         ent $$5 = dkq.a($$1, $$4);
         if ($$5 != env.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ent $$0) {
      return false;
   }

   protected void a(dsb $$0, dbx $$1, iz $$2, ent $$3) {
   }
}
