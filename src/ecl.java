import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class ecl {
   public static final Codec<ecl> b = ki.U.q().dispatch(ecl::b, ecm::codec);

   public abstract Stream<ib> a_(ecj var1, axd var2, ib var3);

   public abstract ecm<?> b();
}
