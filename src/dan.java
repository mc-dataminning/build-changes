import com.mojang.serialization.Codec;

public record dan() {
   public static final dan a = new dan();
   public static final Codec<dan> b = Codec.unit(() -> a);
}
