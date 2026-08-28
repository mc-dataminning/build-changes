import com.mojang.serialization.MapCodec;

public interface eqi<P extends eqh> {
   eqi<eqf> a = a("clear", eqf.a);
   eqi<eqg> b = a("passthrough", eqg.b);
   eqi<eqe> c = a("append_static", eqe.a);
   eqi<eqd> d = a("append_loot", eqd.a);

   MapCodec<P> codec();

   private static <P extends eqh> eqi<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.n, $$0, () -> $$1);
   }
}
