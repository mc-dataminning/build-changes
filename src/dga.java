import com.mojang.serialization.Codec;

public record dga() {
   public static final dga a = new dga();
   public static final Codec<dga> b = Codec.unit(() -> a);
}
