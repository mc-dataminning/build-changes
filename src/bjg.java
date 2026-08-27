import com.mojang.serialization.Codec;

public interface bjg<P extends bjf> {
   bjg<bjc> a = a("constant", bjc.b);
   bjg<bjl> b = a("uniform", bjl.a);
   bjg<bix> c = a("biased_to_bottom", bix.a);
   bjg<biy> d = a("clamped", biy.a);
   bjg<bjm> e = a("weighted_list", bjm.a);
   bjg<bja> f = a("clamped_normal", bja.a);

   Codec<P> codec();

   static <P extends bjf> bjg<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.M, $$0, () -> $$1);
   }
}
