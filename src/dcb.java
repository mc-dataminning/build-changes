import com.mojang.serialization.Codec;

public record dcb() {
   public static final dcb a = new dcb();
   public static final Codec<dcb> b = Codec.unit(() -> a);
}
