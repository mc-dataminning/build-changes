import com.mojang.serialization.Codec;

public interface eek<P extends eej> {
   eek<eei> a = a("single_pool_element", eei.b);
   eek<eeh> b = a("list_pool_element", eeh.a);
   eek<eed> c = a("feature_pool_element", eed.a);
   eek<eec> d = a("empty_pool_element", eec.a);
   eek<eeg> e = a("legacy_single_pool_element", eeg.a);

   Codec<P> codec();

   static <P extends eej> eek<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.ai, $$0, () -> $$1);
   }
}
