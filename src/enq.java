import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class enq {
   public static final Codec<enq> b = mb.S.q().dispatch(enq::b, enr::codec);

   public abstract Stream<ji> a_(eno var1, azh var2, ji var3);

   public abstract enr<?> b();
}
