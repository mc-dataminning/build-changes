import com.mojang.serialization.Codec;

public interface eiv<P extends eiu> {
   eiv<eit> a = a("always_true", eit.a);
   eiv<eir> b = a("linear_pos", eir.a);
   eiv<eig> c = a("axis_aligned_linear_pos", eig.a);

   Codec<P> codec();

   static <P extends eiu> eiv<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.q, $$0, () -> $$1);
   }
}
