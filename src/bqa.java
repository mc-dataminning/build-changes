import com.mojang.serialization.MapCodec;

public interface bqa<P extends bpz> {
   bqa<bpx> a = a("constant", bpx.b);
   bqa<bqg> b = a("uniform", bqg.a);
   bqa<bpv> c = a("clamped_normal", bpv.a);
   bqa<bqf> d = a("trapezoid", bqf.a);

   MapCodec<P> codec();

   static <P extends bpz> bqa<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.L, $$0, () -> $$1);
   }
}
