import com.mojang.serialization.MapCodec;

public interface eoq<P extends eop> {
   eoq<eoo> a = a("constant", eoo.b);
   eoq<eos> b = a("uniform", eos.a);
   eoq<eon> c = a("biased_to_bottom", eon.a);
   eoq<eot> d = a("very_biased_to_bottom", eot.a);
   eoq<eor> e = a("trapezoid", eor.a);
   eoq<eou> f = a("weighted_list", eou.a);

   MapCodec<P> codec();

   private static <P extends eop> eoq<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.L, $$0, () -> $$1);
   }
}
