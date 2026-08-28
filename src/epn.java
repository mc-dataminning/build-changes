import com.mojang.serialization.MapCodec;

public interface epn<P extends epm> {
   epn<epl> a = a("always_true", epl.a);
   epn<epi> b = a("linear_pos", epi.a);
   epn<eox> c = a("axis_aligned_linear_pos", eox.a);

   MapCodec<P> codec();

   static <P extends epm> epn<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.o, $$0, () -> $$1);
   }
}
