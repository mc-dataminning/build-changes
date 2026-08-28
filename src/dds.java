import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dds {
   Codec<dds> b = mb.aw.q().dispatch(dds::a, Function.identity());

   static MapCodec<? extends dds> a(ke<MapCodec<? extends dds>> $$0) {
      ke.a($$0, "add", ddj.a);
      ke.a($$0, "all_of", ddk.c.a);
      ke.a($$0, "multiply", ddv.a);
      ke.a($$0, "remove_binomial", ddx.a);
      return ke.a($$0, "set", dec.a);
   }

   float a(int var1, azh var2, float var3);

   MapCodec<? extends dds> a();
}
