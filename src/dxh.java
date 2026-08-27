import com.mojang.serialization.Codec;

public interface dxh<P extends dxg> {
   dxh<dxf> a = a("constant", dxf.b);
   dxh<dxj> b = a("uniform", dxj.a);
   dxh<dxe> c = a("biased_to_bottom", dxe.a);
   dxh<dxk> d = a("very_biased_to_bottom", dxk.a);
   dxh<dxi> e = a("trapezoid", dxi.a);
   dxh<dxl> f = a("weighted_list", dxl.a);

   Codec<P> codec();

   private static <P extends dxg> dxh<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.N, $$0, () -> $$1);
   }
}
