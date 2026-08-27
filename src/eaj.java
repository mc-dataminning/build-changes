import com.mojang.serialization.Codec;

public interface eaj<P extends eai> {
   eaj<eah> a = a("always_true", eah.a);
   eaj<eaf> b = a("linear_pos", eaf.a);
   eaj<dzu> c = a("axis_aligned_linear_pos", dzu.a);

   Codec<P> codec();

   static <P extends eai> eaj<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.r, $$0, () -> $$1);
   }
}
