import com.mojang.serialization.MapCodec;

public interface eos<P extends eor> {
   eos<eoq> a = a("always_true", eoq.a);
   eos<eon> b = a("linear_pos", eon.a);
   eos<eoc> c = a("axis_aligned_linear_pos", eoc.a);

   MapCodec<P> codec();

   static <P extends eor> eos<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.o, $$0, () -> $$1);
   }
}
