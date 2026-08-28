import com.mojang.serialization.MapCodec;

public interface eno<P extends enn> {
   eno<enm> a = a("constant", enm.b);
   eno<enq> b = a("uniform", enq.a);
   eno<enl> c = a("biased_to_bottom", enl.a);
   eno<enr> d = a("very_biased_to_bottom", enr.a);
   eno<enp> e = a("trapezoid", enp.a);
   eno<ens> f = a("weighted_list", ens.a);

   MapCodec<P> codec();

   private static <P extends enn> eno<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.L, $$0, () -> $$1);
   }
}
