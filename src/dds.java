import com.mojang.serialization.MapCodec;

public abstract class dds extends dez {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ewk h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ewk b = ewh.a(
      ewh.b(), ewh.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), evv.e
   );
   protected final kf.a c;

   @Override
   protected abstract MapCodec<? extends dds> a();

   public dds(dsb.d $$0, kf.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dsc $$0) {
      return 0.0;
   }

   protected boolean a(dsc $$0, iz $$1, bsu $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cK().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      kf $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2) {
      return h;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   public abstract boolean d(dsc var1);

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      iz $$4 = dkr.a((dby)$$1, $$2);
      if ($$4 != null) {
         enu $$5 = dkr.a($$1, $$4);
         if ($$5 != enw.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(enu $$0) {
      return false;
   }

   protected void a(dsc $$0, dby $$1, iz $$2, enu $$3) {
   }
}
