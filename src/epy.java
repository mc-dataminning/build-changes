import com.mojang.serialization.MapCodec;

public interface epy<P extends epx> {
   epy<epw> a = a("always_true", epw.a);
   epy<ept> b = a("linear_pos", ept.a);
   epy<epi> c = a("axis_aligned_linear_pos", epi.a);

   MapCodec<P> codec();

   static <P extends epx> epy<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.o, $$0, () -> $$1);
   }
}
