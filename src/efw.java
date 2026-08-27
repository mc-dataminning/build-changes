import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class efw {
   public static final Codec<efw> b = ld.U.q().dispatch(efw::b, efx::codec);

   public abstract Stream<in> a_(efu var1, ayg var2, in var3);

   public abstract efx<?> b();
}
