import com.mojang.serialization.Codec;

public interface ejc<P extends ejb> {
   ejc<eif> a = a("always_true", eif.a);
   ejc<eik> b = a("block_match", eik.a);
   ejc<eim> c = a("blockstate_match", eim.a);
   ejc<ejj> d = a("tag_match", ejj.a);
   ejc<eiy> e = a("random_block_match", eiy.a);
   ejc<eiz> f = a("random_blockstate_match", eiz.a);

   Codec<P> codec();

   static <P extends ejb> ejc<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.o, $$0, () -> $$1);
   }
}
