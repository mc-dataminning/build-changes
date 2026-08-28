import com.mojang.serialization.MapCodec;

public interface eiw<P extends eiv> {
   eiw<eiu> a = a("constant", eiu.b);
   eiw<eiy> b = a("uniform", eiy.a);
   eiw<eit> c = a("biased_to_bottom", eit.a);
   eiw<eiz> d = a("very_biased_to_bottom", eiz.a);
   eiw<eix> e = a("trapezoid", eix.a);
   eiw<eja> f = a("weighted_list", eja.a);

   MapCodec<P> codec();

   private static <P extends eiv> eiw<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.L, $$0, () -> $$1);
   }
}
