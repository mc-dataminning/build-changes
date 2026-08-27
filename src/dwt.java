import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class dwt {
   public static final Codec<dwt> b = kc.V.q().dispatch(dwt::b, dwu::codec);

   public abstract Stream<hx> a_(dwr var1, atw var2, hx var3);

   public abstract dwu<?> b();
}
