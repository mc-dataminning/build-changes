import com.mojang.serialization.MapCodec;

public interface evy<P extends evx> {
   evy<eva> a = a("always_true", eva.a);
   evy<evf> b = a("block_match", evf.a);
   evy<evh> c = a("blockstate_match", evh.a);
   evy<ewf> d = a("tag_match", ewf.a);
   evy<evu> e = a("random_block_match", evu.a);
   evy<evv> f = a("random_blockstate_match", evv.a);

   MapCodec<P> codec();

   static <P extends evx> evy<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.m, $$0, () -> $$1);
   }
}
