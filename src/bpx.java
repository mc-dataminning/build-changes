import com.mojang.serialization.MapCodec;

public interface bpx<P extends bpw> {
   bpx<bpu> a = a("constant", bpu.b);
   bpx<bqd> b = a("uniform", bqd.a);
   bpx<bps> c = a("clamped_normal", bps.a);
   bpx<bqc> d = a("trapezoid", bqc.a);

   MapCodec<P> codec();

   static <P extends bpw> bpx<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.L, $$0, () -> $$1);
   }
}
