import com.mojang.serialization.Codec;

public interface bgi<P extends bgh> {
   bgi<bgf> a = a("constant", bgf.b);
   bgi<bgo> b = a("uniform", bgo.a);
   bgi<bgd> c = a("clamped_normal", bgd.a);
   bgi<bgn> d = a("trapezoid", bgn.a);

   Codec<P> codec();

   static <P extends bgh> bgi<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.M, $$0, () -> $$1);
   }
}
