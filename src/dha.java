import com.mojang.serialization.Codec;

public record dha() {
   public static final dha a = new dha();
   public static final Codec<dha> b = Codec.unit(() -> a);
}
