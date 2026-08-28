import com.mojang.serialization.Codec;

public record ddo() {
   public static final ddo a = new ddo();
   public static final Codec<ddo> b = Codec.unit(() -> a);
}
