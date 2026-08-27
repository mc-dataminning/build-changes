import com.mojang.serialization.Codec;

public class eas extends ebe {
   public static final Codec<eas> a = Codec.unit(() -> eas.b);
   public static final eas b = new eas();

   private eas() {
   }

   @Override
   protected ebg<?> a() {
      return ebg.j;
   }
}
