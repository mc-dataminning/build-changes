import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ctq extends ctp.b<cts> {
   Codec<ctq> b = mg.aD.q().dispatch(ctq::a, $$0 -> $$0);

   MapCodec<? extends ctq> a();
}
