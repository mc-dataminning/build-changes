import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dzc implements dze {
   private static final dzc b = new dzc();
   public static final Codec<dzc> a = Codec.unit(b);

   @Override
   public qu a(arx $$0, @Nullable qu $$1) {
      return new qu();
   }

   @Override
   public dzf<?> a() {
      return dzf.a;
   }
}
