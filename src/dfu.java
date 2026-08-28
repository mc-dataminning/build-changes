import com.mojang.serialization.Codec;

public record dfu() {
   public static final dfu a = new dfu();
   public static final Codec<dfu> b = Codec.unit(() -> a);
}
