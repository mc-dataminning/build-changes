import com.mojang.serialization.Codec;

public interface dvo<P extends dvn> {
   dvo<dur> a = a("always_true", dur.a);
   dvo<duw> b = a("block_match", duw.a);
   dvo<duy> c = a("blockstate_match", duy.a);
   dvo<dvv> d = a("tag_match", dvv.a);
   dvo<dvk> e = a("random_block_match", dvk.a);
   dvo<dvl> f = a("random_blockstate_match", dvl.a);

   Codec<P> codec();

   static <P extends dvn> dvo<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.p, $$0, () -> $$1);
   }
}
