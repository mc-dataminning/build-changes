import com.mojang.serialization.MapCodec;

public class emy extends enk {
   public static final MapCodec<emy> a = MapCodec.unit(() -> emy.b);
   public static final emy b = new emy();

   private emy() {
   }

   @Override
   protected enm<?> a() {
      return enm.j;
   }
}
