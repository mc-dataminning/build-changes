import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgq {
   Codec<dgq> b = mg.au.q().dispatch(dgq::a, Function.identity());

   static MapCodec<? extends dgq> a(js<MapCodec<? extends dgq>> $$0) {
      js.a($$0, "add", dgh.a);
      js.a($$0, "all_of", dgi.c.a);
      js.a($$0, "multiply", dgt.a);
      js.a($$0, "remove_binomial", dgv.a);
      return js.a($$0, "set", dha.a);
   }

   float a(int var1, azv var2, float var3);

   MapCodec<? extends dgq> a();
}
