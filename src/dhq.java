import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dhq {
   Codec<dhq> b = mh.au.q().dispatch(dhq::a, Function.identity());

   static MapCodec<? extends dhq> a(jt<MapCodec<? extends dhq>> $$0) {
      jt.a($$0, "add", dhh.a);
      jt.a($$0, "all_of", dhi.c.a);
      jt.a($$0, "multiply", dht.a);
      jt.a($$0, "remove_binomial", dhv.a);
      return jt.a($$0, "set", dia.a);
   }

   float a(int var1, bai var2, float var3);

   MapCodec<? extends dhq> a();
}
