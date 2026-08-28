import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eob {
   Codec<eob> c = lt.n.r().dispatch(eob::a, eoc::codec);

   @Nullable
   ub a(ayw var1, @Nullable ub var2);

   eoc<?> a();
}
