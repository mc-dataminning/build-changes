import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class dyv {
   public static final Codec<dyv> b = kd.U.q().dispatch(dyv::b, dyw::codec);

   public abstract Stream<hx> a_(dyt var1, auw var2, hx var3);

   public abstract dyw<?> b();
}
