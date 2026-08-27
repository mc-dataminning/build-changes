import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class dwc {
   public static final Codec<dwc> b = jy.V.q().dispatch(dwc::b, dwd::codec);

   public abstract Stream<ht> a_(dwa var1, ato var2, ht var3);

   public abstract dwd<?> b();
}
