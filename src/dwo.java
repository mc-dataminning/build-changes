import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class dwo {
   public static final Codec<dwo> b = jy.V.q().dispatch(dwo::b, dwp::codec);

   public abstract Stream<ht> a_(dwm var1, ats var2, ht var3);

   public abstract dwp<?> b();
}
