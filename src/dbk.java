import com.mojang.serialization.MapCodec;

public interface dbk {
   static MapCodec<? extends dbj> a(jz<MapCodec<? extends dbj>> $$0) {
      jz.a($$0, "by_cost", dbl.b);
      jz.a($$0, "by_cost_with_difficulty", dbm.c);
      return jz.a($$0, "single", dbn.b);
   }
}
