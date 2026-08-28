import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dau {
   Codec<dau> b = lt.ay.r().dispatch(dau::a, Function.identity());

   static MapCodec<? extends dau> a(jz<MapCodec<? extends dau>> $$0) {
      jz.a($$0, "add", dal.a);
      jz.a($$0, "all_of", dam.c.a);
      jz.a($$0, "multiply", dax.a);
      jz.a($$0, "remove_binomial", daz.a);
      return jz.a($$0, "set", dbe.a);
   }

   float a(int var1, ayw var2, float var3);

   MapCodec<? extends dau> a();
}
