import com.mojang.serialization.MapCodec;

public interface erj<P extends eri> {
   erj<eql> a = a("always_true", eql.a);
   erj<eqq> b = a("block_match", eqq.a);
   erj<eqs> c = a("blockstate_match", eqs.a);
   erj<erq> d = a("tag_match", erq.a);
   erj<erf> e = a("random_block_match", erf.a);
   erj<erg> f = a("random_blockstate_match", erg.a);

   MapCodec<P> codec();

   static <P extends eri> erj<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.m, $$0, () -> $$1);
   }
}
