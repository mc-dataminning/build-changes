import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class ebn {
   public static final Codec<ebn> b = kh.U.q().dispatch(ebn::b, ebo::codec);

   public abstract Stream<ib> a_(ebl var1, awt var2, ib var3);

   public abstract ebo<?> b();
}
