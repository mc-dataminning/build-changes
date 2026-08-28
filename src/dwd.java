import com.mojang.serialization.MapCodec;

public class dwd extends dpr {
   public static final MapCodec<dwd> c = b(dwd::new);
   private static final ffc e = dma.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dwd> a() {
      return c;
   }

   public dwd(dzy.d $$0) {
      super($$0, ja.a, e, false);
   }

   @Override
   protected dps c() {
      return (dps)dmc.pc;
   }
}
