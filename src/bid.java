import com.mojang.serialization.Codec;

public interface bid<P extends bic> {
   bid<bhz> a = a("constant", bhz.b);
   bid<bii> b = a("uniform", bii.a);
   bid<bhu> c = a("biased_to_bottom", bhu.a);
   bid<bhv> d = a("clamped", bhv.a);
   bid<bij> e = a("weighted_list", bij.a);
   bid<bhx> f = a("clamped_normal", bhx.a);

   Codec<P> codec();

   static <P extends bic> bid<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.N, $$0, () -> $$1);
   }
}
