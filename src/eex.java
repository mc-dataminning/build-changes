import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eex {
   public static final Codec<eex> b = kt.U.q().dispatch(eex::b, eey::codec);

   public abstract Stream<id> a_(eev var1, axt var2, id var3);

   public abstract eey<?> b();
}
