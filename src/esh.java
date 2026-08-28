import com.mojang.serialization.MapCodec;

public interface esh<P extends esg> {
   esh<erj> a = a("always_true", erj.a);
   esh<ero> b = a("block_match", ero.a);
   esh<erq> c = a("blockstate_match", erq.a);
   esh<eso> d = a("tag_match", eso.a);
   esh<esd> e = a("random_block_match", esd.a);
   esh<ese> f = a("random_blockstate_match", ese.a);

   MapCodec<P> codec();

   static <P extends esg> esh<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.m, $$0, () -> $$1);
   }
}
