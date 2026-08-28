import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eql {
   Codec<eql> c = lz.n.q().dispatch(eql::a, eqm::codec);

   @Nullable
   un a(azv var1, @Nullable un var2);

   eqm<?> a();
}
