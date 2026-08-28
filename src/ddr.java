import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface ddr {
   Codec<ddr> b = mb.aw.q().dispatch(ddr::a, Function.identity());

   static MapCodec<? extends ddr> a(ke<MapCodec<? extends ddr>> $$0) {
      ke.a($$0, "add", ddi.a);
      ke.a($$0, "all_of", ddj.c.a);
      ke.a($$0, "multiply", ddu.a);
      ke.a($$0, "remove_binomial", ddw.a);
      return ke.a($$0, "set", deb.a);
   }

   float a(int var1, azh var2, float var3);

   MapCodec<? extends ddr> a();
}
