import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgt {
   Codec<dgt> b = mg.au.q().dispatch(dgt::a, Function.identity());

   static MapCodec<? extends dgt> a(js<MapCodec<? extends dgt>> $$0) {
      js.a($$0, "add", dgk.a);
      js.a($$0, "all_of", dgl.c.a);
      js.a($$0, "multiply", dgw.a);
      js.a($$0, "remove_binomial", dgy.a);
      return js.a($$0, "set", dhd.a);
   }

   float a(int var1, azv var2, float var3);

   MapCodec<? extends dgt> a();
}
