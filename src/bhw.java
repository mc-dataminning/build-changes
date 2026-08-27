import com.mojang.serialization.Codec;

public interface bhw<P extends bhv> {
   bhw<bhs> a = a("constant", bhs.b);
   bhw<bib> b = a("uniform", bib.a);
   bhw<bhn> c = a("biased_to_bottom", bhn.a);
   bhw<bho> d = a("clamped", bho.a);
   bhw<bic> e = a("weighted_list", bic.a);
   bhw<bhq> f = a("clamped_normal", bhq.a);

   Codec<P> codec();

   static <P extends bhv> bhw<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.N, $$0, () -> $$1);
   }
}
