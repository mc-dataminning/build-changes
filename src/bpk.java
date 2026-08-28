import com.mojang.serialization.MapCodec;

public interface bpk<P extends bpj> {
   bpk<bph> a = a("constant", bph.b);
   bpk<bpq> b = a("uniform", bpq.a);
   bpk<bpf> c = a("clamped_normal", bpf.a);
   bpk<bpp> d = a("trapezoid", bpp.a);

   MapCodec<P> codec();

   static <P extends bpj> bpk<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.J, $$0, () -> $$1);
   }
}
