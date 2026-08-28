import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcp {
   Codec<dcp> b = lz.aw.q().dispatch(dcp::a, Function.identity());

   static MapCodec<? extends dcp> a(kd<MapCodec<? extends dcp>> $$0) {
      kd.a($$0, "add", dcg.a);
      kd.a($$0, "all_of", dch.c.a);
      kd.a($$0, "multiply", dcs.a);
      kd.a($$0, "remove_binomial", dcu.a);
      return kd.a($$0, "set", dcz.a);
   }

   float a(int var1, azv var2, float var3);

   MapCodec<? extends dcp> a();
}
