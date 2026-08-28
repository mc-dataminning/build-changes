import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface cud extends cuc.b<cuf> {
   Codec<cud> b = mh.aD.q().dispatch(cud::a, $$0 -> $$0);

   MapCodec<? extends cud> a();
}
