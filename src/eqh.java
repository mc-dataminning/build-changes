import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eqh {
   Codec<eqh> c = ly.n.q().dispatch(eqh::a, eqi::codec);

   @Nullable
   uk a(azs var1, @Nullable uk var2);

   eqi<?> a();
}
