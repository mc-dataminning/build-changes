import com.mojang.serialization.MapCodec;

public interface evr<P extends evq> {
   evr<evp> a = a("always_true", evp.a);
   evr<evm> b = a("linear_pos", evm.a);
   evr<evb> c = a("axis_aligned_linear_pos", evb.a);

   MapCodec<P> codec();

   static <P extends evq> evr<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.o, $$0, () -> $$1);
   }
}
