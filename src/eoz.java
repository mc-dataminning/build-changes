import com.mojang.serialization.MapCodec;

public interface eoz<P extends eoy> {
   eoz<eob> a = a("always_true", eob.a);
   eoz<eog> b = a("block_match", eog.a);
   eoz<eoi> c = a("blockstate_match", eoi.a);
   eoz<epg> d = a("tag_match", epg.a);
   eoz<eov> e = a("random_block_match", eov.a);
   eoz<eow> f = a("random_blockstate_match", eow.a);

   MapCodec<P> codec();

   static <P extends eoy> eoz<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.m, $$0, () -> $$1);
   }
}
