import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcw {
   Codec<dcw> b = lz.aw.q().dispatch(dcw::a, Function.identity());

   static MapCodec<? extends dcw> a(kd<MapCodec<? extends dcw>> $$0) {
      kd.a($$0, "add", dcn.a);
      kd.a($$0, "all_of", dco.c.a);
      kd.a($$0, "multiply", dcz.a);
      kd.a($$0, "remove_binomial", ddb.a);
      return kd.a($$0, "set", ddg.a);
   }

   float a(int var1, azu var2, float var3);

   MapCodec<? extends dcw> a();
}
