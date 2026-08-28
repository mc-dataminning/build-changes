import com.mojang.serialization.MapCodec;

public class dmn extends dfb {
   public static final MapCodec<dmn> a = b(dmn::new);
   protected static final ewm b = dfb.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   public dmn(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected ewm b_(dse $$0, dbg $$1, iz $$2) {
      return ewj.b();
   }

   @Override
   protected ewm c(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return ewj.b();
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      dfh.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && $$2.a(dfd.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   protected float d(dse $$0, dbg $$1, iz $$2) {
      return 0.2F;
   }
}
