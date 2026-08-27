import com.mojang.serialization.Codec;

public interface ecc<P extends ecb> {
   ecc<eca> a = a("always_true", eca.a);
   ecc<eby> b = a("linear_pos", eby.a);
   ecc<ebn> c = a("axis_aligned_linear_pos", ebn.a);

   Codec<P> codec();

   static <P extends ecb> ecc<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.q, $$0, () -> $$1);
   }
}
