import com.mojang.serialization.Codec;

public record deo() {
   public static final deo a = new deo();
   public static final Codec<deo> b = Codec.unit(() -> a);
}
