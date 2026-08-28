import com.mojang.serialization.MapCodec;

public interface erk<P extends erj> {
   erk<eqm> a = a("always_true", eqm.a);
   erk<eqr> b = a("block_match", eqr.a);
   erk<eqt> c = a("blockstate_match", eqt.a);
   erk<err> d = a("tag_match", err.a);
   erk<erg> e = a("random_block_match", erg.a);
   erk<erh> f = a("random_blockstate_match", erh.a);

   MapCodec<P> codec();

   static <P extends erj> erk<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.m, $$0, () -> $$1);
   }
}
