import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcg {
   Codec<dcg> b = lv.ax.q().dispatch(dcg::a, Function.identity());

   static MapCodec<? extends dcg> a(kb<MapCodec<? extends dcg>> $$0) {
      kb.a($$0, "add", dbx.a);
      kb.a($$0, "all_of", dby.c.a);
      kb.a($$0, "multiply", dcj.a);
      kb.a($$0, "remove_binomial", dcl.a);
      return kb.a($$0, "set", dcq.a);
   }

   float a(int var1, azn var2, float var3);

   MapCodec<? extends dcg> a();
}
