import com.mojang.serialization.Codec;

public record dck() {
   public static final dck a = new dck();
   public static final Codec<dck> b = Codec.unit(() -> a);
}
