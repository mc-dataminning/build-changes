import com.mojang.serialization.MapCodec;

public interface esw<P extends esv> {
   esw<esu> a = a("always_true", esu.a);
   esw<esr> b = a("linear_pos", esr.a);
   esw<esg> c = a("axis_aligned_linear_pos", esg.a);

   MapCodec<P> codec();

   static <P extends esv> esw<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.o, $$0, () -> $$1);
   }
}
