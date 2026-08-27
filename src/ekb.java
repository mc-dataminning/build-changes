import com.mojang.serialization.Codec;

public interface ekb<P extends eka> {
   ekb<eje> a = a("always_true", eje.a);
   ekb<ejj> b = a("block_match", ejj.a);
   ekb<ejl> c = a("blockstate_match", ejl.a);
   ekb<eki> d = a("tag_match", eki.a);
   ekb<ejx> e = a("random_block_match", ejx.a);
   ekb<ejy> f = a("random_blockstate_match", ejy.a);

   Codec<P> codec();

   static <P extends eka> ekb<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.o, $$0, () -> $$1);
   }
}
