import com.mojang.serialization.MapCodec;

public class dmx extends dey {
   public static final MapCodec<dmx> a = b(dmx::new);
   private static final double b = 5.0;
   private static final ewj c = dey.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   protected dmx(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.a;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected float d(dsb $$0, dbd $$1, iz $$2) {
      return 1.0F;
   }
}
