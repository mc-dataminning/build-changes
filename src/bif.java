import com.mojang.serialization.Codec;

public interface bif<P extends bie> {
   bif<bic> a = a("constant", bic.b);
   bif<bil> b = a("uniform", bil.a);
   bif<bia> c = a("clamped_normal", bia.a);
   bif<bik> d = a("trapezoid", bik.a);

   Codec<P> codec();

   static <P extends bie> bif<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.M, $$0, () -> $$1);
   }
}
