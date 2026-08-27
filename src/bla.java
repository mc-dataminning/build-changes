import com.mojang.serialization.Codec;

public interface bla<P extends bkz> {
   bla<bkx> a = a("constant", bkx.b);
   bla<blg> b = a("uniform", blg.a);
   bla<bkv> c = a("clamped_normal", bkv.a);
   bla<blf> d = a("trapezoid", blf.a);

   Codec<P> codec();

   static <P extends bkz> bla<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.L, $$0, () -> $$1);
   }
}
