import com.mojang.serialization.MapCodec;

public interface dbi {
   static MapCodec<? extends dbh> a(jz<MapCodec<? extends dbh>> $$0) {
      jz.a($$0, "by_cost", dbj.b);
      jz.a($$0, "by_cost_with_difficulty", dbk.c);
      return jz.a($$0, "single", dbl.b);
   }
}
