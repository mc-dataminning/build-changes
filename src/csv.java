import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface csv extends csu.b<csx> {
   Codec<csv> b = mf.aD.q().dispatch(csv::a, $$0 -> $$0);

   MapCodec<? extends csv> a();
}
