import com.mojang.serialization.MapCodec;

public interface bpw<P extends bpv> {
   bpw<bpt> a = a("constant", bpt.b);
   bpw<bqc> b = a("uniform", bqc.a);
   bpw<bpr> c = a("clamped_normal", bpr.a);
   bpw<bqb> d = a("trapezoid", bqb.a);

   MapCodec<P> codec();

   static <P extends bpv> bpw<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.L, $$0, () -> $$1);
   }
}
