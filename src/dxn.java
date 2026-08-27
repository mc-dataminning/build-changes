import com.mojang.serialization.Codec;

public interface dxn<P extends dxm> {
   dxn<dxl> a = a("constant", dxl.b);
   dxn<dxp> b = a("uniform", dxp.a);
   dxn<dxk> c = a("biased_to_bottom", dxk.a);
   dxn<dxq> d = a("very_biased_to_bottom", dxq.a);
   dxn<dxo> e = a("trapezoid", dxo.a);
   dxn<dxr> f = a("weighted_list", dxr.a);

   Codec<P> codec();

   private static <P extends dxm> dxn<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.N, $$0, () -> $$1);
   }
}
