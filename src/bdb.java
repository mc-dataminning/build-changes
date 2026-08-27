import com.mojang.serialization.Codec;

public interface bdb<P extends bda> {
   bdb<bcy> a = a("constant", bcy.b);
   bdb<bdh> b = a("uniform", bdh.a);
   bdb<bcw> c = a("clamped_normal", bcw.a);
   bdb<bdg> d = a("trapezoid", bdg.a);

   Codec<P> codec();

   static <P extends bda> bdb<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.M, $$0, () -> $$1);
   }
}
