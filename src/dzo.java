import com.mojang.serialization.Codec;

public interface dzo<P extends dzn> {
   dzo<dyr> a = a("always_true", dyr.a);
   dzo<dyw> b = a("block_match", dyw.a);
   dzo<dyy> c = a("blockstate_match", dyy.a);
   dzo<dzv> d = a("tag_match", dzv.a);
   dzo<dzk> e = a("random_block_match", dzk.a);
   dzo<dzl> f = a("random_blockstate_match", dzl.a);

   Codec<P> codec();

   static <P extends dzn> dzo<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.p, $$0, () -> $$1);
   }
}
