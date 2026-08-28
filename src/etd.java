import com.mojang.serialization.MapCodec;

public interface etd<P extends etc> {
   etd<esf> a = a("always_true", esf.a);
   etd<esk> b = a("block_match", esk.a);
   etd<esm> c = a("blockstate_match", esm.a);
   etd<etk> d = a("tag_match", etk.a);
   etd<esz> e = a("random_block_match", esz.a);
   etd<eta> f = a("random_blockstate_match", eta.a);

   MapCodec<P> codec();

   static <P extends etc> etd<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.m, $$0, () -> $$1);
   }
}
