import com.mojang.serialization.MapCodec;

public class dcp extends dby {
   public static final MapCodec<dcp> a = b(dcp::new);
   protected static final est b = dby.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dcp> a() {
      return a;
   }

   public dcp(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return !$$1.u($$2.d());
   }
}
