import com.mojang.serialization.Codec;

public interface bjh<P extends bjg> {
   bjh<bjd> a = a("constant", bjd.b);
   bjh<bjm> b = a("uniform", bjm.a);
   bjh<biy> c = a("biased_to_bottom", biy.a);
   bjh<biz> d = a("clamped", biz.a);
   bjh<bjn> e = a("weighted_list", bjn.a);
   bjh<bjb> f = a("clamped_normal", bjb.a);

   Codec<P> codec();

   static <P extends bjg> bjh<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.M, $$0, () -> $$1);
   }
}
