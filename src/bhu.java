import com.mojang.serialization.Codec;

public interface bhu<P extends bht> {
   bhu<bhr> a = a("constant", bhr.b);
   bhu<bia> b = a("uniform", bia.a);
   bhu<bhp> c = a("clamped_normal", bhp.a);
   bhu<bhz> d = a("trapezoid", bhz.a);

   Codec<P> codec();

   static <P extends bht> bhu<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.M, $$0, () -> $$1);
   }
}
