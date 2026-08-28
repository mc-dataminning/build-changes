import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class enj {
   public static final Codec<enj> b = ma.S.q().dispatch(enj::b, enk::codec);

   public abstract Stream<jh> a_(enh var1, bam var2, jh var3);

   public abstract enk<?> b();
}
