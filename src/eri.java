import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eri {
   public static final Codec<eri> b = mg.S.q().dispatch(eri::b, erj::codec);

   public abstract Stream<iv> a_(erg var1, azx var2, iv var3);

   public abstract erj<?> b();
}
