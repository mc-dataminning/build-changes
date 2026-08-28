import com.mojang.serialization.MapCodec;

public interface erh<P extends erg> {
   erh<eqj> a = a("always_true", eqj.a);
   erh<eqo> b = a("block_match", eqo.a);
   erh<eqq> c = a("blockstate_match", eqq.a);
   erh<ero> d = a("tag_match", ero.a);
   erh<erd> e = a("random_block_match", erd.a);
   erh<ere> f = a("random_blockstate_match", ere.a);

   MapCodec<P> codec();

   static <P extends erg> erh<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.m, $$0, () -> $$1);
   }
}
