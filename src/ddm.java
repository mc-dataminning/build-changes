import com.mojang.serialization.Codec;

public record ddm() {
   public static final ddm a = new ddm();
   public static final Codec<ddm> b = Codec.unit(() -> a);
}
