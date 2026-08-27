import com.mojang.serialization.Codec;

public interface bjb<P extends bja> {
   bjb<bix> a = a("constant", bix.b);
   bjb<bjg> b = a("uniform", bjg.a);
   bjb<bis> c = a("biased_to_bottom", bis.a);
   bjb<bit> d = a("clamped", bit.a);
   bjb<bjh> e = a("weighted_list", bjh.a);
   bjb<biv> f = a("clamped_normal", biv.a);

   Codec<P> codec();

   static <P extends bja> bjb<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.M, $$0, () -> $$1);
   }
}
