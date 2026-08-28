import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dge {
   Codec<dge> b = mf.au.q().dispatch(dge::a, Function.identity());

   static MapCodec<? extends dge> a(jr<MapCodec<? extends dge>> $$0) {
      jr.a($$0, "add", dfv.a);
      jr.a($$0, "all_of", dfw.c.a);
      jr.a($$0, "multiply", dgh.a);
      jr.a($$0, "remove_binomial", dgj.a);
      return jr.a($$0, "set", dgo.a);
   }

   float a(int var1, azv var2, float var3);

   MapCodec<? extends dge> a();
}
