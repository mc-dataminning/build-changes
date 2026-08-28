import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dej {
   Codec<dej> b = ma.aw.q().dispatch(dej::a, Function.identity());

   static MapCodec<? extends dej> a(kd<MapCodec<? extends dej>> $$0) {
      kd.a($$0, "add", dea.a);
      kd.a($$0, "all_of", deb.c.a);
      kd.a($$0, "multiply", dem.a);
      kd.a($$0, "remove_binomial", deo.a);
      return kd.a($$0, "set", det.a);
   }

   float a(int var1, bac var2, float var3);

   MapCodec<? extends dej> a();
}
