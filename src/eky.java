import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eky {
   public static final Codec<eky> b = lx.S.q().dispatch(eky::b, ekz::codec);

   public abstract Stream<jg> a_(ekw var1, azr var2, jg var3);

   public abstract ekz<?> b();
}
