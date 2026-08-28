import com.mojang.serialization.Codec;

public class edi implements edb {
   public static final Codec<edi> a = Codec.unit(() -> edi.b);
   public static final edi b = new edi();
}
