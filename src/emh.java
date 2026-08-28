import com.mojang.serialization.MapCodec;

public class emh extends emt {
   public static final MapCodec<emh> a = MapCodec.unit(() -> emh.b);
   public static final emh b = new emh();

   private emh() {
   }

   @Override
   protected emv<?> a() {
      return emv.j;
   }
}
