import com.mojang.serialization.MapCodec;

public interface euf<P extends eue> {
   euf<eth> a = a("always_true", eth.a);
   euf<etm> b = a("block_match", etm.a);
   euf<eto> c = a("blockstate_match", eto.a);
   euf<eum> d = a("tag_match", eum.a);
   euf<eub> e = a("random_block_match", eub.a);
   euf<euc> f = a("random_blockstate_match", euc.a);

   MapCodec<P> codec();

   static <P extends eue> euf<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.m, $$0, () -> $$1);
   }
}
