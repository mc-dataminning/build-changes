import com.mojang.serialization.Codec;

public interface bne<P extends bnd> {
   bne<bnb> a = a("constant", bnb.b);
   bne<bnk> b = a("uniform", bnk.a);
   bne<bmz> c = a("clamped_normal", bmz.a);
   bne<bnj> d = a("trapezoid", bnj.a);

   Codec<P> codec();

   static <P extends bnd> bne<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.L, $$0, () -> $$1);
   }
}
