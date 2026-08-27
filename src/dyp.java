import com.mojang.serialization.Codec;

public interface dyp<P extends dyo> {
   dyp<dyn> a = a("always_true", dyn.a);
   dyp<dyl> b = a("linear_pos", dyl.a);
   dyp<dya> c = a("axis_aligned_linear_pos", dya.a);

   Codec<P> codec();

   static <P extends dyo> dyp<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.r, $$0, () -> $$1);
   }
}
