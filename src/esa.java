import com.mojang.serialization.MapCodec;

public interface esa<P extends erz> {
   esa<erc> a = a("always_true", erc.a);
   esa<erh> b = a("block_match", erh.a);
   esa<erj> c = a("blockstate_match", erj.a);
   esa<esh> d = a("tag_match", esh.a);
   esa<erw> e = a("random_block_match", erw.a);
   esa<erx> f = a("random_blockstate_match", erx.a);

   MapCodec<P> codec();

   static <P extends erz> esa<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.m, $$0, () -> $$1);
   }
}
