import com.mojang.serialization.MapCodec;

public interface erd<P extends erc> {
   erd<erb> a = a("always_true", erb.a);
   erd<eqy> b = a("linear_pos", eqy.a);
   erd<eqn> c = a("axis_aligned_linear_pos", eqn.a);

   MapCodec<P> codec();

   static <P extends erc> erd<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.o, $$0, () -> $$1);
   }
}
