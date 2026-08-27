import com.mojang.serialization.Codec;

public class dpx implements dpq {
   public static final Codec<dpx> a = Codec.unit(() -> dpx.b);
   public static final dpx b = new dpx();
}
