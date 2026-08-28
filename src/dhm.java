import com.mojang.serialization.Codec;

public record dhm() {
   public static final dhm a = new dhm();
   public static final Codec<dhm> b = Codec.unit(() -> a);
}
