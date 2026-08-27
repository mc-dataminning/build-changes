import com.mojang.serialization.Codec;

public interface ekd<P extends ekc> {
   ekd<ekb> a = a("always_true", ekb.a);
   ekd<ejz> b = a("linear_pos", ejz.a);
   ekd<ejo> c = a("axis_aligned_linear_pos", ejo.a);

   Codec<P> codec();

   static <P extends ekc> ekd<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.q, $$0, () -> $$1);
   }
}
