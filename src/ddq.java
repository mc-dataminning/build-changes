import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface ddq {
   Codec<ddq> b = mb.aw.q().dispatch(ddq::a, Function.identity());

   static MapCodec<? extends ddq> a(ke<MapCodec<? extends ddq>> $$0) {
      ke.a($$0, "add", ddh.a);
      ke.a($$0, "all_of", ddi.c.a);
      ke.a($$0, "multiply", ddt.a);
      ke.a($$0, "remove_binomial", ddv.a);
      return ke.a($$0, "set", dea.a);
   }

   float a(int var1, azg var2, float var3);

   MapCodec<? extends ddq> a();
}
