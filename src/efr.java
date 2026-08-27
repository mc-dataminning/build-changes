import com.mojang.serialization.MapCodec;

public interface efr<P extends efq> {
   efr<efp> a = a("constant", efp.b);
   efr<eft> b = a("uniform", eft.a);
   efr<efo> c = a("biased_to_bottom", efo.a);
   efr<efu> d = a("very_biased_to_bottom", efu.a);
   efr<efs> e = a("trapezoid", efs.a);
   efr<efv> f = a("weighted_list", efv.a);

   MapCodec<P> codec();

   private static <P extends efq> efr<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.N, $$0, () -> $$1);
   }
}
