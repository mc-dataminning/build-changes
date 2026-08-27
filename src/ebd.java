import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ebd {
   Codec<ebd> c = jy.q.q().dispatch(ebd::a, ebe::codec);

   @Nullable
   rz a(ato var1, @Nullable rz var2);

   ebe<?> a();
}
