import com.mojang.serialization.MapCodec;

public interface epb<P extends epa> {
   epb<eoz> a = a("constant", eoz.b);
   epb<epd> b = a("uniform", epd.a);
   epb<eoy> c = a("biased_to_bottom", eoy.a);
   epb<epe> d = a("very_biased_to_bottom", epe.a);
   epb<epc> e = a("trapezoid", epc.a);
   epb<epf> f = a("weighted_list", epf.a);

   MapCodec<P> codec();

   private static <P extends epa> epb<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.L, $$0, () -> $$1);
   }
}
