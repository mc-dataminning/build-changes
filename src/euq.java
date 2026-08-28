import com.mojang.serialization.MapCodec;

public interface euq<P extends eup> {
   euq<ets> a = a("always_true", ets.a);
   euq<etx> b = a("block_match", etx.a);
   euq<etz> c = a("blockstate_match", etz.a);
   euq<eux> d = a("tag_match", eux.a);
   euq<eum> e = a("random_block_match", eum.a);
   euq<eun> f = a("random_blockstate_match", eun.a);

   MapCodec<P> codec();

   static <P extends eup> euq<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.m, $$0, () -> $$1);
   }
}
