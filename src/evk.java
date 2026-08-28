import com.mojang.serialization.MapCodec;

public interface evk<P extends evj> {
   evk<eum> a = a("always_true", eum.a);
   evk<eur> b = a("block_match", eur.a);
   evk<eut> c = a("blockstate_match", eut.a);
   evk<evr> d = a("tag_match", evr.a);
   evk<evg> e = a("random_block_match", evg.a);
   evk<evh> f = a("random_blockstate_match", evh.a);

   MapCodec<P> codec();

   static <P extends evj> evk<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.m, $$0, () -> $$1);
   }
}
