import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eie {
   public static final Codec<eie> b = lq.S.r().dispatch(eie::b, eif::codec);

   public abstract Stream<ja> a_(eic var1, ayo var2, ja var3);

   public abstract eif<?> b();
}
