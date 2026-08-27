import com.mojang.serialization.Codec;

public interface bhf<P extends bhe> {
   bhf<bhc> a = a("constant", bhc.b);
   bhf<bhl> b = a("uniform", bhl.a);
   bhf<bha> c = a("clamped_normal", bha.a);
   bhf<bhk> d = a("trapezoid", bhk.a);

   Codec<P> codec();

   static <P extends bhe> bhf<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.M, $$0, () -> $$1);
   }
}
