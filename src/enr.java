import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class enr {
   public static final Codec<enr> b = ma.S.q().dispatch(enr::b, ens::codec);

   public abstract Stream<jh> a_(enp var1, bam var2, jh var3);

   public abstract ens<?> b();
}
