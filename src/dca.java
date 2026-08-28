import com.mojang.serialization.Codec;

public record dca() {
   public static final dca a = new dca();
   public static final Codec<dca> b = Codec.unit(() -> a);
}
