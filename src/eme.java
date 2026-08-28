import com.mojang.serialization.MapCodec;

public interface eme<P extends emd> {
   eme<emc> a = a("always_true", emc.a);
   eme<ema> b = a("linear_pos", ema.a);
   eme<elp> c = a("axis_aligned_linear_pos", elp.a);

   MapCodec<P> codec();

   static <P extends emd> eme<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.o, $$0, () -> $$1);
   }
}
