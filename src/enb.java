import com.mojang.serialization.MapCodec;

public interface enb<P extends ena> {
   enb<emz> a = a("always_true", emz.a);
   enb<emx> b = a("linear_pos", emx.a);
   enb<emm> c = a("axis_aligned_linear_pos", emm.a);

   MapCodec<P> codec();

   static <P extends ena> enb<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.o, $$0, () -> $$1);
   }
}
