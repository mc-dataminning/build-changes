import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface des {
   Codec<des> b = ma.aw.q().dispatch(des::a, Function.identity());

   static MapCodec<? extends des> a(kd<MapCodec<? extends des>> $$0) {
      kd.a($$0, "add", dej.a);
      kd.a($$0, "all_of", dek.c.a);
      kd.a($$0, "multiply", dev.a);
      kd.a($$0, "remove_binomial", dex.a);
      return kd.a($$0, "set", dfc.a);
   }

   float a(int var1, bam var2, float var3);

   MapCodec<? extends des> a();
}
