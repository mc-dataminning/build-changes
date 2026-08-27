import com.mojang.serialization.Codec;

public interface dvh<P extends dvg> {
   dvh<dvf> a = a("always_true", dvf.a);
   dvh<dvd> b = a("linear_pos", dvd.a);
   dvh<dus> c = a("axis_aligned_linear_pos", dus.a);

   Codec<P> codec();

   static <P extends dvg> dvh<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.r, $$0, () -> $$1);
   }
}
