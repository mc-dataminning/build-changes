import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eon {
   public static final Codec<eon> b = md.S.q().dispatch(eon::b, eoo::codec);

   public abstract Stream<jj> a_(eol var1, azs var2, jj var3);

   public abstract eoo<?> b();
}
