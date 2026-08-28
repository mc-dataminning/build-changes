import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgj {
   Codec<dgj> b = mf.au.q().dispatch(dgj::a, Function.identity());

   static MapCodec<? extends dgj> a(jr<MapCodec<? extends dgj>> $$0) {
      jr.a($$0, "add", dga.a);
      jr.a($$0, "all_of", dgb.c.a);
      jr.a($$0, "multiply", dgm.a);
      jr.a($$0, "remove_binomial", dgo.a);
      return jr.a($$0, "set", dgt.a);
   }

   float a(int var1, azv var2, float var3);

   MapCodec<? extends dgj> a();
}
