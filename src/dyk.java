import com.mojang.serialization.Codec;

public interface dyk<P extends dyj> {
   dyk<dyi> a = a("always_true", dyi.a);
   dyk<dyg> b = a("linear_pos", dyg.a);
   dyk<dxv> c = a("axis_aligned_linear_pos", dxv.a);

   Codec<P> codec();

   static <P extends dyj> dyk<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.r, $$0, () -> $$1);
   }
}
