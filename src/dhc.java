import com.mojang.serialization.Codec;

public record dhc() {
   public static final dhc a = new dhc();
   public static final Codec<dhc> b = Codec.unit(() -> a);
}
