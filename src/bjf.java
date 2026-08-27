import com.mojang.serialization.Codec;

public interface bjf<P extends bje> {
   bjf<bjc> a = a("constant", bjc.b);
   bjf<bjl> b = a("uniform", bjl.a);
   bjf<bja> c = a("clamped_normal", bja.a);
   bjf<bjk> d = a("trapezoid", bjk.a);

   Codec<P> codec();

   static <P extends bje> bjf<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.L, $$0, () -> $$1);
   }
}
