import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface ddt {
   Codec<ddt> b = mb.aw.q().dispatch(ddt::a, Function.identity());

   static MapCodec<? extends ddt> a(ke<MapCodec<? extends ddt>> $$0) {
      ke.a($$0, "add", ddk.a);
      ke.a($$0, "all_of", ddl.c.a);
      ke.a($$0, "multiply", ddw.a);
      ke.a($$0, "remove_binomial", ddy.a);
      return ke.a($$0, "set", ded.a);
   }

   float a(int var1, azh var2, float var3);

   MapCodec<? extends ddt> a();
}
