import com.mojang.serialization.Codec;

public interface bje<P extends bjd> {
   bje<bjb> a = a("constant", bjb.b);
   bje<bjk> b = a("uniform", bjk.a);
   bje<biz> c = a("clamped_normal", biz.a);
   bje<bjj> d = a("trapezoid", bjj.a);

   Codec<P> codec();

   static <P extends bjd> bje<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.L, $$0, () -> $$1);
   }
}
