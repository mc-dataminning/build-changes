import com.mojang.serialization.Codec;

public record dew() {
   public static final dew a = new dew();
   public static final Codec<dew> b = Codec.unit(() -> a);
}
