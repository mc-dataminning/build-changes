import com.mojang.serialization.MapCodec;

public interface bpv<P extends bpu> {
   bpv<bps> a = a("constant", bps.b);
   bpv<bqb> b = a("uniform", bqb.a);
   bpv<bpq> c = a("clamped_normal", bpq.a);
   bpv<bqa> d = a("trapezoid", bqa.a);

   MapCodec<P> codec();

   static <P extends bpu> bpv<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.J, $$0, () -> $$1);
   }
}
