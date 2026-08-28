import com.mojang.serialization.Codec;

public record den() {
   public static final den a = new den();
   public static final Codec<den> b = Codec.unit(() -> a);
}
