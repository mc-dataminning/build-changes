import com.mojang.serialization.Codec;

public interface dzt<P extends dzs> {
   dzt<dzr> a = a("constant", dzr.b);
   dzt<dzv> b = a("uniform", dzv.a);
   dzt<dzq> c = a("biased_to_bottom", dzq.a);
   dzt<dzw> d = a("very_biased_to_bottom", dzw.a);
   dzt<dzu> e = a("trapezoid", dzu.a);
   dzt<dzx> f = a("weighted_list", dzx.a);

   Codec<P> codec();

   private static <P extends dzs> dzt<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.N, $$0, () -> $$1);
   }
}
