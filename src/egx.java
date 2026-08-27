import com.mojang.serialization.Codec;

public interface egx<P extends egw> {
   egx<ega> a = a("always_true", ega.a);
   egx<egf> b = a("block_match", egf.a);
   egx<egh> c = a("blockstate_match", egh.a);
   egx<ehe> d = a("tag_match", ehe.a);
   egx<egt> e = a("random_block_match", egt.a);
   egx<egu> f = a("random_blockstate_match", egu.a);

   Codec<P> codec();

   static <P extends egw> egx<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.o, $$0, () -> $$1);
   }
}
