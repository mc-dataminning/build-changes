import com.mojang.serialization.MapCodec;

public interface evt<P extends evs> {
   evt<evr> a = a("always_true", evr.a);
   evt<evo> b = a("linear_pos", evo.a);
   evt<evd> c = a("axis_aligned_linear_pos", evd.a);

   MapCodec<P> codec();

   static <P extends evs> evt<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.o, $$0, () -> $$1);
   }
}
