import com.mojang.serialization.MapCodec;

public interface eqm<P extends eql> {
   eqm<eqj> a = a("clear", eqj.a);
   eqm<eqk> b = a("passthrough", eqk.b);
   eqm<eqi> c = a("append_static", eqi.a);
   eqm<eqh> d = a("append_loot", eqh.a);

   MapCodec<P> codec();

   private static <P extends eql> eqm<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.n, $$0, () -> $$1);
   }
}
