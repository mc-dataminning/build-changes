import com.mojang.serialization.Codec;

public interface egq<P extends egp> {
   egq<ego> a = a("always_true", ego.a);
   egq<egm> b = a("linear_pos", egm.a);
   egq<egb> c = a("axis_aligned_linear_pos", egb.a);

   Codec<P> codec();

   static <P extends egp> egq<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.q, $$0, () -> $$1);
   }
}
