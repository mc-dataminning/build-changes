import com.mojang.serialization.MapCodec;

public interface ekf<P extends eke> {
   ekf<ekd> a = a("constant", ekd.b);
   ekf<ekh> b = a("uniform", ekh.a);
   ekf<ekc> c = a("biased_to_bottom", ekc.a);
   ekf<eki> d = a("very_biased_to_bottom", eki.a);
   ekf<ekg> e = a("trapezoid", ekg.a);
   ekf<ekj> f = a("weighted_list", ekj.a);

   MapCodec<P> codec();

   private static <P extends eke> ekf<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.L, $$0, () -> $$1);
   }
}
