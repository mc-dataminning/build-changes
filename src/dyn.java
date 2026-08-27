import com.mojang.serialization.Codec;

public interface dyn<P extends dym> {
   dyn<dxq> a = a("always_true", dxq.a);
   dyn<dxv> b = a("block_match", dxv.a);
   dyn<dxx> c = a("blockstate_match", dxx.a);
   dyn<dyu> d = a("tag_match", dyu.a);
   dyn<dyj> e = a("random_block_match", dyj.a);
   dyn<dyk> f = a("random_blockstate_match", dyk.a);

   Codec<P> codec();

   static <P extends dym> dyn<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.p, $$0, () -> $$1);
   }
}
