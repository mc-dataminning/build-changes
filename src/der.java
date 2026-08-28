import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface der {
   Codec<der> b = ma.aw.q().dispatch(der::a, Function.identity());

   static MapCodec<? extends der> a(kd<MapCodec<? extends der>> $$0) {
      kd.a($$0, "add", dei.a);
      kd.a($$0, "all_of", dej.c.a);
      kd.a($$0, "multiply", deu.a);
      kd.a($$0, "remove_binomial", dew.a);
      return kd.a($$0, "set", dfb.a);
   }

   float a(int var1, bam var2, float var3);

   MapCodec<? extends der> a();
}
