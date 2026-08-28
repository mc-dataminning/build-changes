import com.mojang.serialization.MapCodec;

public class ewa extends ewm {
   public static final MapCodec<ewa> a = MapCodec.unit(() -> ewa.b);
   public static final ewa b = new ewa();

   private ewa() {
   }

   @Override
   protected ewo<?> a() {
      return ewo.j;
   }
}
