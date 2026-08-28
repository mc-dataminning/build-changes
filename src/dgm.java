import com.mojang.serialization.Codec;

public record dgm() {
   public static final dgm a = new dgm();
   public static final Codec<dgm> b = Codec.unit(() -> a);
}
