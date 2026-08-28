import com.mojang.serialization.MapCodec;

public interface egn<P extends egm> {
   egn<egl> a = a("constant", egl.b);
   egn<egp> b = a("uniform", egp.a);
   egn<egk> c = a("biased_to_bottom", egk.a);
   egn<egq> d = a("very_biased_to_bottom", egq.a);
   egn<ego> e = a("trapezoid", ego.a);
   egn<egr> f = a("weighted_list", egr.a);

   MapCodec<P> codec();

   private static <P extends egm> egn<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.N, $$0, () -> $$1);
   }
}
