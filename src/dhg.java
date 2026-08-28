import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dhg {
   Codec<dhg> b = mh.au.q().dispatch(dhg::a, Function.identity());

   static MapCodec<? extends dhg> a(jt<MapCodec<? extends dhg>> $$0) {
      jt.a($$0, "add", dgx.a);
      jt.a($$0, "all_of", dgy.c.a);
      jt.a($$0, "multiply", dhj.a);
      jt.a($$0, "remove_binomial", dhl.a);
      return jt.a($$0, "set", dhq.a);
   }

   float a(int var1, azz var2, float var3);

   MapCodec<? extends dhg> a();
}
