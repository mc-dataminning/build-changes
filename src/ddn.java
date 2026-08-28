import com.mojang.serialization.Codec;

public record ddn() {
   public static final ddn a = new ddn();
   public static final Codec<ddn> b = Codec.unit(() -> a);
}
