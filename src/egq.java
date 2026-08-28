import com.mojang.serialization.MapCodec;

public interface egq<P extends egp> {
   egq<ego> a = a("constant", ego.b);
   egq<egs> b = a("uniform", egs.a);
   egq<egn> c = a("biased_to_bottom", egn.a);
   egq<egt> d = a("very_biased_to_bottom", egt.a);
   egq<egr> e = a("trapezoid", egr.a);
   egq<egu> f = a("weighted_list", egu.a);

   MapCodec<P> codec();

   private static <P extends egp> egq<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.N, $$0, () -> $$1);
   }
}
