import com.mojang.serialization.Codec;

public interface egs<P extends egr> {
   egs<egq> a = a("always_true", egq.a);
   egs<ego> b = a("linear_pos", ego.a);
   egs<egd> c = a("axis_aligned_linear_pos", egd.a);

   Codec<P> codec();

   static <P extends egr> egs<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.q, $$0, () -> $$1);
   }
}
