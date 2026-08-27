import com.mojang.serialization.Codec;

public interface biz<P extends biy> {
   biz<biw> a = a("constant", biw.b);
   biz<bjf> b = a("uniform", bjf.a);
   biz<biu> c = a("clamped_normal", biu.a);
   biz<bje> d = a("trapezoid", bje.a);

   Codec<P> codec();

   static <P extends biy> biz<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.L, $$0, () -> $$1);
   }
}
