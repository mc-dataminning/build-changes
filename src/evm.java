import com.mojang.serialization.MapCodec;

public interface evm<P extends evl> {
   evm<evj> a = a("clear", evj.a);
   evm<evk> b = a("passthrough", evk.b);
   evm<evi> c = a("append_static", evi.a);
   evm<evh> d = a("append_loot", evh.a);

   MapCodec<P> codec();

   private static <P extends evl> evm<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.n, $$0, () -> $$1);
   }
}
