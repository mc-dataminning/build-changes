import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dfy {
   Codec<dfy> b = mf.au.q().dispatch(dfy::a, Function.identity());

   static MapCodec<? extends dfy> a(jr<MapCodec<? extends dfy>> $$0) {
      jr.a($$0, "add", dfp.a);
      jr.a($$0, "all_of", dfq.c.a);
      jr.a($$0, "multiply", dgb.a);
      jr.a($$0, "remove_binomial", dgd.a);
      return jr.a($$0, "set", dgi.a);
   }

   float a(int var1, azt var2, float var3);

   MapCodec<? extends dfy> a();
}
