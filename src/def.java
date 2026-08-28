import com.mojang.serialization.Codec;

public record def() {
   public static final def a = new def();
   public static final Codec<def> b = Codec.unit(() -> a);
}
