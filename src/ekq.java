import com.mojang.serialization.MapCodec;

public interface ekq<P extends ekp> {
   ekq<eko> a = a("constant", eko.b);
   ekq<eks> b = a("uniform", eks.a);
   ekq<ekn> c = a("biased_to_bottom", ekn.a);
   ekq<ekt> d = a("very_biased_to_bottom", ekt.a);
   ekq<ekr> e = a("trapezoid", ekr.a);
   ekq<eku> f = a("weighted_list", eku.a);

   MapCodec<P> codec();

   private static <P extends ekp> ekq<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.L, $$0, () -> $$1);
   }
}
