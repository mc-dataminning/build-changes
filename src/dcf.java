import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcf {
   Codec<dcf> b = lx.aw.q().dispatch(dcf::a, Function.identity());

   static MapCodec<? extends dcf> a(kc<MapCodec<? extends dcf>> $$0) {
      kc.a($$0, "add", dbw.a);
      kc.a($$0, "all_of", dbx.c.a);
      kc.a($$0, "multiply", dci.a);
      kc.a($$0, "remove_binomial", dck.a);
      return kc.a($$0, "set", dcp.a);
   }

   float a(int var1, azr var2, float var3);

   MapCodec<? extends dcf> a();
}
