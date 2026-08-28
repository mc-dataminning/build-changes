import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dbp {
   Codec<dbp> b = lu.ax.q().dispatch(dbp::a, Function.identity());

   static MapCodec<? extends dbp> a(ka<MapCodec<? extends dbp>> $$0) {
      ka.a($$0, "add", dbg.a);
      ka.a($$0, "all_of", dbh.c.a);
      ka.a($$0, "multiply", dbs.a);
      ka.a($$0, "remove_binomial", dbu.a);
      return ka.a($$0, "set", dbz.a);
   }

   float a(int var1, azk var2, float var3);

   MapCodec<? extends dbp> a();
}
