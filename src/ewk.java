import com.mojang.serialization.MapCodec;

public interface ewk<P extends ewj> {
   ewk<evm> a = a("always_true", evm.a);
   ewk<evr> b = a("block_match", evr.a);
   ewk<evt> c = a("blockstate_match", evt.a);
   ewk<ewr> d = a("tag_match", ewr.a);
   ewk<ewg> e = a("random_block_match", ewg.a);
   ewk<ewh> f = a("random_blockstate_match", ewh.a);

   MapCodec<P> codec();

   static <P extends ewj> ewk<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.m, $$0, () -> $$1);
   }
}
