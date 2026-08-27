import com.mojang.serialization.Codec;

public interface dyy<P extends dyx> {
   dyy<dyb> a = a("always_true", dyb.a);
   dyy<dyg> b = a("block_match", dyg.a);
   dyy<dyi> c = a("blockstate_match", dyi.a);
   dyy<dzf> d = a("tag_match", dzf.a);
   dyy<dyu> e = a("random_block_match", dyu.a);
   dyy<dyv> f = a("random_blockstate_match", dyv.a);

   Codec<P> codec();

   static <P extends dyx> dyy<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.p, $$0, () -> $$1);
   }
}
