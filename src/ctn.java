import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ctn extends ctm.b<ctp> {
   Codec<ctn> b = mg.aD.q().dispatch(ctn::a, $$0 -> $$0);

   MapCodec<? extends ctn> a();
}
