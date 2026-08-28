import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class enq {
   public static final Codec<enq> b = ma.S.q().dispatch(enq::b, enr::codec);

   public abstract Stream<jh> a_(eno var1, bam var2, jh var3);

   public abstract enr<?> b();
}
