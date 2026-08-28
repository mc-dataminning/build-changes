import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dek {
   Codec<dek> b = ma.aw.q().dispatch(dek::a, Function.identity());

   static MapCodec<? extends dek> a(kd<MapCodec<? extends dek>> $$0) {
      kd.a($$0, "add", deb.a);
      kd.a($$0, "all_of", dec.c.a);
      kd.a($$0, "multiply", den.a);
      kd.a($$0, "remove_binomial", dep.a);
      return kd.a($$0, "set", deu.a);
   }

   float a(int var1, bam var2, float var3);

   MapCodec<? extends dek> a();
}
