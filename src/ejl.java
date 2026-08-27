import com.mojang.serialization.Codec;

public interface ejl<P extends ejk> {
   ejl<eio> a = a("always_true", eio.a);
   ejl<eit> b = a("block_match", eit.a);
   ejl<eiv> c = a("blockstate_match", eiv.a);
   ejl<ejs> d = a("tag_match", ejs.a);
   ejl<ejh> e = a("random_block_match", ejh.a);
   ejl<eji> f = a("random_blockstate_match", eji.a);

   Codec<P> codec();

   static <P extends ejk> ejl<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.o, $$0, () -> $$1);
   }
}
