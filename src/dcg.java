import com.mojang.serialization.Codec;

public record dcg() {
   public static final dcg a = new dcg();
   public static final Codec<dcg> b = Codec.unit(() -> a);
}
