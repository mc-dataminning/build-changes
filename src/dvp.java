import com.mojang.serialization.Codec;

public interface dvp<P extends dvo> {
   dvp<dvn> a = a("constant", dvn.b);
   dvp<dvr> b = a("uniform", dvr.a);
   dvp<dvm> c = a("biased_to_bottom", dvm.a);
   dvp<dvs> d = a("very_biased_to_bottom", dvs.a);
   dvp<dvq> e = a("trapezoid", dvq.a);
   dvp<dvt> f = a("weighted_list", dvt.a);

   Codec<P> codec();

   private static <P extends dvo> dvp<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.O, $$0, () -> $$1);
   }
}
