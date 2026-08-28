import com.mojang.serialization.Codec;

public record czz() {
   public static final czz a = new czz();
   public static final Codec<czz> b = Codec.unit(() -> a);
}
