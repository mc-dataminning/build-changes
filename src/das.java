import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface das {
   Codec<das> b = lt.ay.r().dispatch(das::a, Function.identity());

   static MapCodec<? extends das> a(jz<MapCodec<? extends das>> $$0) {
      jz.a($$0, "add", daj.a);
      jz.a($$0, "all_of", dak.c.a);
      jz.a($$0, "multiply", dav.a);
      jz.a($$0, "remove_binomial", dax.a);
      return jz.a($$0, "set", dbc.a);
   }

   float a(int var1, ayv var2, float var3);

   MapCodec<? extends das> a();
}
