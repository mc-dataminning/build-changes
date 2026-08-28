import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class enk {
   public static final Codec<enk> b = ma.S.q().dispatch(enk::b, enl::codec);

   public abstract Stream<jh> a_(eni var1, bac var2, jh var3);

   public abstract enl<?> b();
}
