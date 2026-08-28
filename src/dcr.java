import com.mojang.serialization.Codec;

public record dcr() {
   public static final dcr a = new dcr();
   public static final Codec<dcr> b = Codec.unit(() -> a);
}
