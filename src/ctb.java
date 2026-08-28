import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ctb extends cta.b<ctd> {
   Codec<ctb> b = mf.aD.q().dispatch(ctb::a, $$0 -> $$0);

   MapCodec<? extends ctb> a();
}
