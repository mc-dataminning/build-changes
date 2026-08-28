import com.mojang.serialization.MapCodec;

public interface emk<P extends emj> {
   emk<emi> a = a("constant", emi.b);
   emk<emm> b = a("uniform", emm.a);
   emk<emh> c = a("biased_to_bottom", emh.a);
   emk<emn> d = a("very_biased_to_bottom", emn.a);
   emk<eml> e = a("trapezoid", eml.a);
   emk<emo> f = a("weighted_list", emo.a);

   MapCodec<P> codec();

   private static <P extends emj> emk<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.L, $$0, () -> $$1);
   }
}
