import com.mojang.serialization.Codec;

public interface bjg<P extends bjf> {
   bjg<bjd> a = a("constant", bjd.b);
   bjg<bjm> b = a("uniform", bjm.a);
   bjg<bjb> c = a("clamped_normal", bjb.a);
   bjg<bjl> d = a("trapezoid", bjl.a);

   Codec<P> codec();

   static <P extends bjf> bjg<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.L, $$0, () -> $$1);
   }
}
