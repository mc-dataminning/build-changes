import com.mojang.serialization.Codec;

public interface ekk<P extends ekj> {
   ekk<ejn> a = a("always_true", ejn.a);
   ekk<ejs> b = a("block_match", ejs.a);
   ekk<eju> c = a("blockstate_match", eju.a);
   ekk<ekr> d = a("tag_match", ekr.a);
   ekk<ekg> e = a("random_block_match", ekg.a);
   ekk<ekh> f = a("random_blockstate_match", ekh.a);

   Codec<P> codec();

   static <P extends ekj> ekk<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.o, $$0, () -> $$1);
   }
}
