import com.mojang.serialization.MapCodec;

public interface bsu<P extends bst> {
   bsu<bsr> a = a("constant", bsr.b);
   bsu<bta> b = a("uniform", bta.a);
   bsu<bsp> c = a("clamped_normal", bsp.a);
   bsu<bsz> d = a("trapezoid", bsz.a);

   MapCodec<P> codec();

   static <P extends bst> bsu<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.J, $$0, () -> $$1);
   }
}
