import com.mojang.serialization.Codec;

public interface bji<P extends bjh> {
   bji<bje> a = a("constant", bje.b);
   bji<bjn> b = a("uniform", bjn.a);
   bji<biz> c = a("biased_to_bottom", biz.a);
   bji<bja> d = a("clamped", bja.a);
   bji<bjo> e = a("weighted_list", bjo.a);
   bji<bjc> f = a("clamped_normal", bjc.a);

   Codec<P> codec();

   static <P extends bjh> bji<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.M, $$0, () -> $$1);
   }
}
