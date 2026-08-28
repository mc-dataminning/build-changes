import com.mojang.serialization.MapCodec;

public interface egr<P extends egq> {
   egr<egp> a = a("constant", egp.b);
   egr<egt> b = a("uniform", egt.a);
   egr<ego> c = a("biased_to_bottom", ego.a);
   egr<egu> d = a("very_biased_to_bottom", egu.a);
   egr<egs> e = a("trapezoid", egs.a);
   egr<egv> f = a("weighted_list", egv.a);

   MapCodec<P> codec();

   private static <P extends egq> egr<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.N, $$0, () -> $$1);
   }
}
