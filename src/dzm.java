import com.mojang.serialization.Codec;

public interface dzm<P extends dzl> {
   dzm<dzk> a = a("constant", dzk.b);
   dzm<dzo> b = a("uniform", dzo.a);
   dzm<dzj> c = a("biased_to_bottom", dzj.a);
   dzm<dzp> d = a("very_biased_to_bottom", dzp.a);
   dzm<dzn> e = a("trapezoid", dzn.a);
   dzm<dzq> f = a("weighted_list", dzq.a);

   Codec<P> codec();

   private static <P extends dzl> dzm<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.N, $$0, () -> $$1);
   }
}
