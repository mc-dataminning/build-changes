import com.mojang.serialization.Codec;

public interface dyj<P extends dyi> {
   dyj<dyh> a = a("always_true", dyh.a);
   dyj<dyf> b = a("linear_pos", dyf.a);
   dyj<dxu> c = a("axis_aligned_linear_pos", dxu.a);

   Codec<P> codec();

   static <P extends dyi> dyj<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.r, $$0, () -> $$1);
   }
}
