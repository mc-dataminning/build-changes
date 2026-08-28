import com.mojang.serialization.MapCodec;

public interface emd<P extends emc> {
   emd<elg> a = a("always_true", elg.a);
   emd<ell> b = a("block_match", ell.a);
   emd<eln> c = a("blockstate_match", eln.a);
   emd<emk> d = a("tag_match", emk.a);
   emd<elz> e = a("random_block_match", elz.a);
   emd<ema> f = a("random_blockstate_match", ema.a);

   MapCodec<P> codec();

   static <P extends emc> emd<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.o, $$0, () -> $$1);
   }
}
