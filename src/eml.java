import com.mojang.serialization.MapCodec;

public interface eml<P extends emk> {
   eml<emj> a = a("constant", emj.b);
   eml<emn> b = a("uniform", emn.a);
   eml<emi> c = a("biased_to_bottom", emi.a);
   eml<emo> d = a("very_biased_to_bottom", emo.a);
   eml<emm> e = a("trapezoid", emm.a);
   eml<emp> f = a("weighted_list", emp.a);

   MapCodec<P> codec();

   private static <P extends emk> eml<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.L, $$0, () -> $$1);
   }
}
