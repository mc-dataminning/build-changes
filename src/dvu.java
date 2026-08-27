import com.mojang.serialization.Codec;

public interface dvu<P extends dvt> {
   dvu<dvs> a = a("constant", dvs.b);
   dvu<dvw> b = a("uniform", dvw.a);
   dvu<dvr> c = a("biased_to_bottom", dvr.a);
   dvu<dvx> d = a("very_biased_to_bottom", dvx.a);
   dvu<dvv> e = a("trapezoid", dvv.a);
   dvu<dvy> f = a("weighted_list", dvy.a);

   Codec<P> codec();

   private static <P extends dvt> dvu<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.O, $$0, () -> $$1);
   }
}
