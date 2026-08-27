import com.mojang.serialization.MapCodec;

public interface eft<P extends efs> {
   eft<efr> a = a("constant", efr.b);
   eft<efv> b = a("uniform", efv.a);
   eft<efq> c = a("biased_to_bottom", efq.a);
   eft<efw> d = a("very_biased_to_bottom", efw.a);
   eft<efu> e = a("trapezoid", efu.a);
   eft<efx> f = a("weighted_list", efx.a);

   MapCodec<P> codec();

   private static <P extends efs> eft<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.N, $$0, () -> $$1);
   }
}
