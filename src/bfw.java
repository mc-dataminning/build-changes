import com.mojang.serialization.Codec;

public interface bfw<P extends bfv> {
   bfw<bfs> a = a("constant", bfs.b);
   bfw<bgb> b = a("uniform", bgb.a);
   bfw<bfn> c = a("biased_to_bottom", bfn.a);
   bfw<bfo> d = a("clamped", bfo.a);
   bfw<bgc> e = a("weighted_list", bgc.a);
   bfw<bfq> f = a("clamped_normal", bfq.a);

   Codec<P> codec();

   static <P extends bfv> bfw<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.N, $$0, () -> $$1);
   }
}
