import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eiy {
   public static final Codec<eiy> b = lt.S.r().dispatch(eiy::b, eiz::codec);

   public abstract Stream<jd> a_(eiw var1, ayw var2, jd var3);

   public abstract eiz<?> b();
}
