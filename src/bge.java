import com.mojang.serialization.Codec;

public interface bge<P extends bgd> {
   bge<bga> a = a("constant", bga.b);
   bge<bgj> b = a("uniform", bgj.a);
   bge<bfv> c = a("biased_to_bottom", bfv.a);
   bge<bfw> d = a("clamped", bfw.a);
   bge<bgk> e = a("weighted_list", bgk.a);
   bge<bfy> f = a("clamped_normal", bfy.a);

   Codec<P> codec();

   static <P extends bgd> bge<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.N, $$0, () -> $$1);
   }
}
