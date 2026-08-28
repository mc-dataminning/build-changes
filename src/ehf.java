import com.mojang.serialization.MapCodec;

public interface ehf<P extends ehe> {
   ehf<ehd> a = a("constant", ehd.b);
   ehf<ehh> b = a("uniform", ehh.a);
   ehf<ehc> c = a("biased_to_bottom", ehc.a);
   ehf<ehi> d = a("very_biased_to_bottom", ehi.a);
   ehf<ehg> e = a("trapezoid", ehg.a);
   ehf<ehj> f = a("weighted_list", ehj.a);

   MapCodec<P> codec();

   private static <P extends ehe> ehf<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.L, $$0, () -> $$1);
   }
}
