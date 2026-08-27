import com.mojang.serialization.MapCodec;

public class dij extends ddn {
   public static final MapCodec<dij> a = b(dij::new);
   protected static final eui b = dde.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(avr.aL) || $$0.a(ddg.dX) || super.b($$0, $$1, $$2);
   }
}
