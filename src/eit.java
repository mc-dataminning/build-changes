import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eit {
   public static final Codec<eit> b = lt.S.r().dispatch(eit::b, eiu::codec);

   public abstract Stream<jd> a_(eir var1, ayv var2, jd var3);

   public abstract eiu<?> b();
}
