import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ewl {
   Codec<ewl> c = mg.n.q().dispatch(ewl::a, ewm::codec);

   @Nullable
   tz a(azx var1, @Nullable tz var2);

   ewm<?> a();
}
