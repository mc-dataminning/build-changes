import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dae {
   Codec<dae> b = lq.ay.r().dispatch(dae::a, Function.identity());

   static MapCodec<? extends dae> a(jw<MapCodec<? extends dae>> $$0) {
      jw.a($$0, "add", czv.a);
      jw.a($$0, "all_of", czw.c.a);
      jw.a($$0, "multiply", dah.a);
      jw.a($$0, "remove_binomial", daj.a);
      return jw.a($$0, "set", dao.a);
   }

   float a(int var1, ayo var2, float var3);

   MapCodec<? extends dae> a();
}
