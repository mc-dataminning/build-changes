import com.mojang.serialization.Codec;

public interface dyl<P extends dyk> {
   dyl<dxo> a = a("always_true", dxo.a);
   dyl<dxt> b = a("block_match", dxt.a);
   dyl<dxv> c = a("blockstate_match", dxv.a);
   dyl<dys> d = a("tag_match", dys.a);
   dyl<dyh> e = a("random_block_match", dyh.a);
   dyl<dyi> f = a("random_blockstate_match", dyi.a);

   Codec<P> codec();

   static <P extends dyk> dyl<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.p, $$0, () -> $$1);
   }
}
