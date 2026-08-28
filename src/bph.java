import com.mojang.serialization.MapCodec;

public interface bph<P extends bpg> {
   bph<bpe> a = a("constant", bpe.b);
   bph<bpn> b = a("uniform", bpn.a);
   bph<bpc> c = a("clamped_normal", bpc.a);
   bph<bpm> d = a("trapezoid", bpm.a);

   MapCodec<P> codec();

   static <P extends bpg> bph<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.J, $$0, () -> $$1);
   }
}
