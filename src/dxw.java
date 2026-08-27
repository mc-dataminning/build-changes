import com.mojang.serialization.Codec;

public interface dxw<P extends dxv> {
   dxw<dxu> a = a("constant", dxu.b);
   dxw<dxy> b = a("uniform", dxy.a);
   dxw<dxt> c = a("biased_to_bottom", dxt.a);
   dxw<dxz> d = a("very_biased_to_bottom", dxz.a);
   dxw<dxx> e = a("trapezoid", dxx.a);
   dxw<dya> f = a("weighted_list", dya.a);

   Codec<P> codec();

   private static <P extends dxv> dxw<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.N, $$0, () -> $$1);
   }
}
