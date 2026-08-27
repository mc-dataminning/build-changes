import com.mojang.serialization.Codec;

public interface dxo<P extends dxn> {
   dxo<dxm> a = a("constant", dxm.b);
   dxo<dxq> b = a("uniform", dxq.a);
   dxo<dxl> c = a("biased_to_bottom", dxl.a);
   dxo<dxr> d = a("very_biased_to_bottom", dxr.a);
   dxo<dxp> e = a("trapezoid", dxp.a);
   dxo<dxs> f = a("weighted_list", dxs.a);

   Codec<P> codec();

   private static <P extends dxn> dxo<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.N, $$0, () -> $$1);
   }
}
