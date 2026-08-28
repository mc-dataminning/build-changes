import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcl {
   Codec<dcl> b = ly.aw.q().dispatch(dcl::a, Function.identity());

   static MapCodec<? extends dcl> a(kd<MapCodec<? extends dcl>> $$0) {
      kd.a($$0, "add", dcc.a);
      kd.a($$0, "all_of", dcd.c.a);
      kd.a($$0, "multiply", dco.a);
      kd.a($$0, "remove_binomial", dcq.a);
      return kd.a($$0, "set", dcv.a);
   }

   float a(int var1, azs var2, float var3);

   MapCodec<? extends dcl> a();
}
