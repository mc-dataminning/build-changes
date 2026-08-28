import com.mojang.serialization.MapCodec;

public interface esa<P extends erz> {
   esa<ery> a = a("always_true", ery.a);
   esa<erv> b = a("linear_pos", erv.a);
   esa<erk> c = a("axis_aligned_linear_pos", erk.a);

   MapCodec<P> codec();

   static <P extends erz> esa<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.o, $$0, () -> $$1);
   }
}
