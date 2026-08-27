import com.mojang.serialization.Codec;

public interface bge<P extends bgd> {
   bge<bgb> a = a("constant", bgb.b);
   bge<bgk> b = a("uniform", bgk.a);
   bge<bfz> c = a("clamped_normal", bfz.a);
   bge<bgj> d = a("trapezoid", bgj.a);

   Codec<P> codec();

   static <P extends bgd> bge<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.M, $$0, () -> $$1);
   }
}
