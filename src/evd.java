import com.mojang.serialization.MapCodec;

public interface evd<P extends evc> {
   evd<evb> a = a("always_true", evb.a);
   evd<euy> b = a("linear_pos", euy.a);
   evd<eun> c = a("axis_aligned_linear_pos", eun.a);

   MapCodec<P> codec();

   static <P extends evc> evd<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.o, $$0, () -> $$1);
   }
}
