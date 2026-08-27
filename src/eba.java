import com.mojang.serialization.Codec;

public interface eba<P extends eaz> {
   eba<eay> a = a("always_true", eay.a);
   eba<eaw> b = a("linear_pos", eaw.a);
   eba<eal> c = a("axis_aligned_linear_pos", eal.a);

   Codec<P> codec();

   static <P extends eaz> eba<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.r, $$0, () -> $$1);
   }
}
