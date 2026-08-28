import com.mojang.serialization.MapCodec;

public interface eri<P extends erh> {
   eri<eqk> a = a("always_true", eqk.a);
   eri<eqp> b = a("block_match", eqp.a);
   eri<eqr> c = a("blockstate_match", eqr.a);
   eri<erp> d = a("tag_match", erp.a);
   eri<ere> e = a("random_block_match", ere.a);
   eri<erf> f = a("random_blockstate_match", erf.a);

   MapCodec<P> codec();

   static <P extends erh> eri<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.m, $$0, () -> $$1);
   }
}
