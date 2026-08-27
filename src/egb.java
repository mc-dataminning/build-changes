import com.mojang.serialization.Codec;

public interface egb<P extends ega> {
   egb<efe> a = a("always_true", efe.a);
   egb<efj> b = a("block_match", efj.a);
   egb<efl> c = a("blockstate_match", efl.a);
   egb<egi> d = a("tag_match", egi.a);
   egb<efx> e = a("random_block_match", efx.a);
   egb<efy> f = a("random_blockstate_match", efy.a);

   Codec<P> codec();

   static <P extends ega> egb<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.o, $$0, () -> $$1);
   }
}
