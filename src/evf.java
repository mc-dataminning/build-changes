import com.mojang.serialization.MapCodec;

public interface evf<P extends eve> {
   evf<euh> a = a("always_true", euh.a);
   evf<eum> b = a("block_match", eum.a);
   evf<euo> c = a("blockstate_match", euo.a);
   evf<evm> d = a("tag_match", evm.a);
   evf<evb> e = a("random_block_match", evb.a);
   evf<evc> f = a("random_blockstate_match", evc.a);

   MapCodec<P> codec();

   static <P extends eve> evf<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.m, $$0, () -> $$1);
   }
}
