import com.mojang.serialization.MapCodec;

public interface emk<P extends emj> {
   emk<emi> a = a("always_true", emi.a);
   emk<emg> b = a("linear_pos", emg.a);
   emk<elv> c = a("axis_aligned_linear_pos", elv.a);

   MapCodec<P> codec();

   static <P extends emj> emk<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.o, $$0, () -> $$1);
   }
}
