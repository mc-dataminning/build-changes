import com.mojang.serialization.Codec;

public interface dyq<P extends dyp> {
   dyq<dxt> a = a("always_true", dxt.a);
   dyq<dxy> b = a("block_match", dxy.a);
   dyq<dya> c = a("blockstate_match", dya.a);
   dyq<dyx> d = a("tag_match", dyx.a);
   dyq<dym> e = a("random_block_match", dym.a);
   dyq<dyn> f = a("random_blockstate_match", dyn.a);

   Codec<P> codec();

   static <P extends dyp> dyq<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.p, $$0, () -> $$1);
   }
}
