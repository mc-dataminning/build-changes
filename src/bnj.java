import com.mojang.serialization.Codec;

public interface bnj<P extends bni> {
   bnj<bng> a = a("constant", bng.b);
   bnj<bnp> b = a("uniform", bnp.a);
   bnj<bne> c = a("clamped_normal", bne.a);
   bnj<bno> d = a("trapezoid", bno.a);

   Codec<P> codec();

   static <P extends bni> bnj<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.L, $$0, () -> $$1);
   }
}
