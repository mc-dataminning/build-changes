import com.mojang.serialization.MapCodec;

public interface eur<P extends euq> {
   eur<eup> a = a("always_true", eup.a);
   eur<eum> b = a("linear_pos", eum.a);
   eur<eub> c = a("axis_aligned_linear_pos", eub.a);

   MapCodec<P> codec();

   static <P extends euq> eur<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.o, $$0, () -> $$1);
   }
}
