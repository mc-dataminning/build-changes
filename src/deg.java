import com.mojang.serialization.Codec;

public record deg() {
   public static final deg a = new deg();
   public static final Codec<deg> b = Codec.unit(() -> a);
}
