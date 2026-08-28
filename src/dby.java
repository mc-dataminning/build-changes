import com.mojang.serialization.Codec;

public record dby() {
   public static final dby a = new dby();
   public static final Codec<dby> b = Codec.unit(() -> a);
}
