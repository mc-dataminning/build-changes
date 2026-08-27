import com.mojang.serialization.Codec;

public interface bfz<P extends bfy> {
   bfz<bfv> a = a("constant", bfv.b);
   bfz<bge> b = a("uniform", bge.a);
   bfz<bfq> c = a("biased_to_bottom", bfq.a);
   bfz<bfr> d = a("clamped", bfr.a);
   bfz<bgf> e = a("weighted_list", bgf.a);
   bfz<bft> f = a("clamped_normal", bft.a);

   Codec<P> codec();

   static <P extends bfy> bfz<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.N, $$0, () -> $$1);
   }
}
