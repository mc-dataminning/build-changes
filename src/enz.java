import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface enz {
   Codec<enz> c = lt.n.r().dispatch(enz::a, eoa::codec);

   @Nullable
   ub a(ayw var1, @Nullable ub var2);

   eoa<?> a();
}
