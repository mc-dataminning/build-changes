import com.mojang.serialization.Codec;

public interface eez<P extends eey> {
   eez<eex> a = a("always_true", eex.a);
   eez<eev> b = a("linear_pos", eev.a);
   eez<eek> c = a("axis_aligned_linear_pos", eek.a);

   Codec<P> codec();

   static <P extends eey> eez<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.q, $$0, () -> $$1);
   }
}
