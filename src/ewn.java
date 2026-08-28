import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ewn {
   Codec<ewn> c = mh.n.q().dispatch(ewn::a, ewo::codec);

   @Nullable
   ua a(azz var1, @Nullable ua var2);

   ewo<?> a();
}
