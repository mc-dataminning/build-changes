import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface epm {
   Codec<epm> c = lu.n.q().dispatch(epm::a, epn::codec);

   @Nullable
   uf a(azl var1, @Nullable uf var2);

   epn<?> a();
}
