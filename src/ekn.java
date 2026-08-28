import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class ekn {
   public static final Codec<ekn> b = lv.S.q().dispatch(ekn::b, eko::codec);

   public abstract Stream<jf> a_(ekl var1, azn var2, jf var3);

   public abstract eko<?> b();
}
