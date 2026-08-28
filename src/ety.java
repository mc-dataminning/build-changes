import com.mojang.serialization.MapCodec;

public interface ety<P extends etx> {
   ety<etw> a = a("always_true", etw.a);
   ety<ett> b = a("linear_pos", ett.a);
   ety<eti> c = a("axis_aligned_linear_pos", eti.a);

   MapCodec<P> codec();

   static <P extends etx> ety<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.o, $$0, () -> $$1);
   }
}
