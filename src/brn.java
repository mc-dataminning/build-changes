import com.mojang.serialization.MapCodec;

public interface brn<P extends brm> {
   brn<brj> a = a("constant", brj.b);
   brn<brs> b = a("uniform", brs.a);
   brn<bre> c = a("biased_to_bottom", bre.a);
   brn<brf> d = a("clamped", brf.a);
   brn<brt> e = a("weighted_list", brt.a);
   brn<brh> f = a("clamped_normal", brh.a);

   MapCodec<P> codec();

   static <P extends brm> brn<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.K, $$0, () -> $$1);
   }
}
