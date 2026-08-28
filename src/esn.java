import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface esn {
   Codec<esn> c = ma.n.q().dispatch(esn::a, eso::codec);

   @Nullable
   um a(bac var1, @Nullable um var2);

   eso<?> a();
}
