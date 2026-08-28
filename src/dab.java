import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dab {
   Codec<dab> b = lq.ay.r().dispatch(dab::a, Function.identity());

   static MapCodec<? extends dab> a(jw<MapCodec<? extends dab>> $$0) {
      jw.a($$0, "add", czs.a);
      jw.a($$0, "all_of", czt.c.a);
      jw.a($$0, "multiply", dae.a);
      jw.a($$0, "remove_binomial", dag.a);
      return jw.a($$0, "set", dal.a);
   }

   float a(cua var1, int var2, aym var3, float var4);

   MapCodec<? extends dab> a();
}
