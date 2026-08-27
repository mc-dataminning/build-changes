import com.mojang.serialization.Codec;

public interface bpe<P extends bpd> {
   bpe<bpb> a = a("constant", bpb.b);
   bpe<bpk> b = a("uniform", bpk.a);
   bpe<boz> c = a("clamped_normal", boz.a);
   bpe<bpj> d = a("trapezoid", bpj.a);

   Codec<P> codec();

   static <P extends bpd> bpe<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.L, $$0, () -> $$1);
   }
}
