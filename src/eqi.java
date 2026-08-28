import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eqi {
   public static final Codec<eqi> b = mf.S.q().dispatch(eqi::b, eqj::codec);

   public abstract Stream<iu> a_(eqg var1, azv var2, iu var3);

   public abstract eqj<?> b();
}
