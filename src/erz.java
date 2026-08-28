import com.mojang.serialization.MapCodec;

public interface erz<P extends ery> {
   erz<erx> a = a("always_true", erx.a);
   erz<eru> b = a("linear_pos", eru.a);
   erz<erj> c = a("axis_aligned_linear_pos", erj.a);

   MapCodec<P> codec();

   static <P extends ery> erz<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.o, $$0, () -> $$1);
   }
}
