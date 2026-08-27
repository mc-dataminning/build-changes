import com.mojang.serialization.Codec;

public interface dzh<P extends dzg> {
   dzh<dzf> a = a("always_true", dzf.a);
   dzh<dzd> b = a("linear_pos", dzd.a);
   dzh<dys> c = a("axis_aligned_linear_pos", dys.a);

   Codec<P> codec();

   static <P extends dzg> dzh<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.r, $$0, () -> $$1);
   }
}
