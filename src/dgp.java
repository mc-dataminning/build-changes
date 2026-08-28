import com.mojang.serialization.Codec;

public record dgp() {
   public static final dgp a = new dgp();
   public static final Codec<dgp> b = Codec.unit(() -> a);
}
