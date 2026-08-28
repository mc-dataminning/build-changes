import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ctg extends ctf.b<cti> {
   Codec<ctg> b = mf.aD.q().dispatch(ctg::a, $$0 -> $$0);

   MapCodec<? extends ctg> a();
}
