import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class dvh {
   public static final Codec<dvh> b = jy.V.q().dispatch(dvh::b, dvi::codec);

   public abstract Stream<ht> a_(dvf var1, ate var2, ht var3);

   public abstract dvi<?> b();
}
