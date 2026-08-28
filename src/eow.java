import com.mojang.serialization.MapCodec;

public interface eow<P extends eov> {
   eow<eou> a = a("always_true", eou.a);
   eow<eor> b = a("linear_pos", eor.a);
   eow<eog> c = a("axis_aligned_linear_pos", eog.a);

   MapCodec<P> codec();

   static <P extends eov> eow<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.o, $$0, () -> $$1);
   }
}
