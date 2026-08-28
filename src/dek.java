import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dek {
   Codec<dek> b = mb.aw.q().dispatch(dek::a, Function.identity());

   static MapCodec<? extends dek> a(ke<MapCodec<? extends dek>> $$0) {
      ke.a($$0, "add", deb.a);
      ke.a($$0, "all_of", dec.c.a);
      ke.a($$0, "multiply", den.a);
      ke.a($$0, "remove_binomial", dep.a);
      return ke.a($$0, "set", deu.a);
   }

   float a(int var1, azh var2, float var3);

   MapCodec<? extends dek> a();
}
