import com.mojang.serialization.Codec;

public interface bdd<P extends bdc> {
   bdd<bcz> a = a("constant", bcz.b);
   bdd<bdi> b = a("uniform", bdi.a);
   bdd<bcu> c = a("biased_to_bottom", bcu.a);
   bdd<bcv> d = a("clamped", bcv.a);
   bdd<bdj> e = a("weighted_list", bdj.a);
   bdd<bcx> f = a("clamped_normal", bcx.a);

   Codec<P> codec();

   static <P extends bdc> bdd<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.N, $$0, () -> $$1);
   }
}
