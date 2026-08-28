import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dfa {
   Codec<dfa> b = md.aw.q().dispatch(dfa::a, Function.identity());

   static MapCodec<? extends dfa> a(kf<MapCodec<? extends dfa>> $$0) {
      kf.a($$0, "add", der.a);
      kf.a($$0, "all_of", des.c.a);
      kf.a($$0, "multiply", dfd.a);
      kf.a($$0, "remove_binomial", dff.a);
      return kf.a($$0, "set", dfk.a);
   }

   float a(int var1, azs var2, float var3);

   MapCodec<? extends dfa> a();
}
