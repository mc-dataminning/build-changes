import com.mojang.serialization.MapCodec;

public interface ert<P extends ers> {
   ert<err> a = a("always_true", err.a);
   ert<ero> b = a("linear_pos", ero.a);
   ert<erd> c = a("axis_aligned_linear_pos", erd.a);

   MapCodec<P> codec();

   static <P extends ers> ert<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.o, $$0, () -> $$1);
   }
}
