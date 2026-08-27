import com.mojang.serialization.Codec;

public interface eje<P extends ejd> {
   eje<ejc> a = a("always_true", ejc.a);
   eje<eja> b = a("linear_pos", eja.a);
   eje<eip> c = a("axis_aligned_linear_pos", eip.a);

   Codec<P> codec();

   static <P extends ejd> eje<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.q, $$0, () -> $$1);
   }
}
