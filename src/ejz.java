import com.mojang.serialization.MapCodec;

public interface ejz<P extends ejy> {
   ejz<ejx> a = a("constant", ejx.b);
   ejz<ekb> b = a("uniform", ekb.a);
   ejz<ejw> c = a("biased_to_bottom", ejw.a);
   ejz<ekc> d = a("very_biased_to_bottom", ekc.a);
   ejz<eka> e = a("trapezoid", eka.a);
   ejz<ekd> f = a("weighted_list", ekd.a);

   MapCodec<P> codec();

   private static <P extends ejy> ejz<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.L, $$0, () -> $$1);
   }
}
