import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class eiw {
   public static final Codec<eiw> b = lt.S.r().dispatch(eiw::b, eix::codec);

   public abstract Stream<jd> a_(eiu var1, ayw var2, jd var3);

   public abstract eix<?> b();
}
