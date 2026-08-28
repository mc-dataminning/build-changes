import com.mojang.serialization.MapCodec;

public interface ehe<P extends ehd> {
   ehe<ehc> a = a("constant", ehc.b);
   ehe<ehg> b = a("uniform", ehg.a);
   ehe<ehb> c = a("biased_to_bottom", ehb.a);
   ehe<ehh> d = a("very_biased_to_bottom", ehh.a);
   ehe<ehf> e = a("trapezoid", ehf.a);
   ehe<ehi> f = a("weighted_list", ehi.a);

   MapCodec<P> codec();

   private static <P extends ehd> ehe<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.L, $$0, () -> $$1);
   }
}
