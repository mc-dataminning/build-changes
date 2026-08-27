import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class dyn {
   public static final Codec<dyn> b = kd.U.q().dispatch(dyn::b, dyo::codec);

   public abstract Stream<hx> a_(dyl var1, auv var2, hx var3);

   public abstract dyo<?> b();
}
