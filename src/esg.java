import com.mojang.serialization.MapCodec;

public interface esg<P extends esf> {
   esg<eri> a = a("always_true", eri.a);
   esg<ern> b = a("block_match", ern.a);
   esg<erp> c = a("blockstate_match", erp.a);
   esg<esn> d = a("tag_match", esn.a);
   esg<esc> e = a("random_block_match", esc.a);
   esg<esd> f = a("random_blockstate_match", esd.a);

   MapCodec<P> codec();

   static <P extends esf> esg<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.m, $$0, () -> $$1);
   }
}
