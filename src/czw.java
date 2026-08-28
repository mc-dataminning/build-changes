import com.mojang.serialization.Codec;

public record czw() {
   public static final czw a = new czw();
   public static final Codec<czw> b = Codec.unit(() -> a);
}
