import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dad {
   Codec<dad> b = lq.ay.r().dispatch(dad::a, Function.identity());

   static MapCodec<? extends dad> a(jw<MapCodec<? extends dad>> $$0) {
      jw.a($$0, "add", czu.a);
      jw.a($$0, "all_of", czv.c.a);
      jw.a($$0, "multiply", dag.a);
      jw.a($$0, "remove_binomial", dai.a);
      return jw.a($$0, "set", dan.a);
   }

   float a(int var1, ayo var2, float var3);

   MapCodec<? extends dad> a();
}
