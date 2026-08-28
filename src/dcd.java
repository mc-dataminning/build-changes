import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcd {
   Codec<dcd> b = lu.ax.q().dispatch(dcd::a, Function.identity());

   static MapCodec<? extends dcd> a(ka<MapCodec<? extends dcd>> $$0) {
      ka.a($$0, "add", dbu.a);
      ka.a($$0, "all_of", dbv.c.a);
      ka.a($$0, "multiply", dcg.a);
      ka.a($$0, "remove_binomial", dci.a);
      return ka.a($$0, "set", dcn.a);
   }

   float a(int var1, azl var2, float var3);

   MapCodec<? extends dcd> a();
}
