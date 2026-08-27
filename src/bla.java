import com.mojang.serialization.Codec;

public interface bla<P extends bkz> {
   bla<bkw> a = a("constant", bkw.b);
   bla<blf> b = a("uniform", blf.a);
   bla<bkr> c = a("biased_to_bottom", bkr.a);
   bla<bks> d = a("clamped", bks.a);
   bla<blg> e = a("weighted_list", blg.a);
   bla<bku> f = a("clamped_normal", bku.a);

   Codec<P> codec();

   static <P extends bkz> bla<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.M, $$0, () -> $$1);
   }
}
