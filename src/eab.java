import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eab {
   Codec<eab> c = jy.q.q().dispatch(eab::a, eac::codec);

   @Nullable
   rt a(ate var1, @Nullable rt var2);

   eac<?> a();
}
