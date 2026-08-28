import com.mojang.serialization.MapCodec;

public interface euy<P extends eux> {
   euy<eua> a = a("always_true", eua.a);
   euy<euf> b = a("block_match", euf.a);
   euy<euh> c = a("blockstate_match", euh.a);
   euy<evf> d = a("tag_match", evf.a);
   euy<euu> e = a("random_block_match", euu.a);
   euy<euv> f = a("random_blockstate_match", euv.a);

   MapCodec<P> codec();

   static <P extends eux> euy<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.m, $$0, () -> $$1);
   }
}
