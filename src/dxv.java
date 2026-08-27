import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class dxv {
   public static final Codec<dxv> b = kb.U.q().dispatch(dxv::b, dxw::codec);

   public abstract Stream<hv> a_(dxt var1, auf var2, hv var3);

   public abstract dxw<?> b();
}
