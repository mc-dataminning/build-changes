import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class erk {
   public static final Codec<erk> b = mh.S.q().dispatch(erk::b, erl::codec);

   public abstract Stream<iw> a_(eri var1, azz var2, iw var3);

   public abstract erl<?> b();
}
