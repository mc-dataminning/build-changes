import com.mojang.serialization.Codec;

public class edp implements edi {
   public static final Codec<edp> a = Codec.unit(() -> edp.b);
   public static final edp b = new edp();
}
