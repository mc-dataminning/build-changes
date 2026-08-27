import com.mojang.serialization.Codec;

public interface bgk<P extends bgj> {
   bgk<bgg> a = a("constant", bgg.b);
   bgk<bgp> b = a("uniform", bgp.a);
   bgk<bgb> c = a("biased_to_bottom", bgb.a);
   bgk<bgc> d = a("clamped", bgc.a);
   bgk<bgq> e = a("weighted_list", bgq.a);
   bgk<bge> f = a("clamped_normal", bge.a);

   Codec<P> codec();

   static <P extends bgj> bgk<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.N, $$0, () -> $$1);
   }
}
