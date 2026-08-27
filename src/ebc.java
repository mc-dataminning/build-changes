import com.mojang.serialization.Codec;

public interface ebc<P extends ebb> {
   ebc<eaf> a = a("always_true", eaf.a);
   ebc<eak> b = a("block_match", eak.a);
   ebc<eam> c = a("blockstate_match", eam.a);
   ebc<ebj> d = a("tag_match", ebj.a);
   ebc<eay> e = a("random_block_match", eay.a);
   ebc<eaz> f = a("random_blockstate_match", eaz.a);

   Codec<P> codec();

   static <P extends ebb> ebc<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.p, $$0, () -> $$1);
   }
}
