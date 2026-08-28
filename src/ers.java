import com.mojang.serialization.MapCodec;

public interface ers<P extends err> {
   ers<erq> a = a("always_true", erq.a);
   ers<ern> b = a("linear_pos", ern.a);
   ers<erc> c = a("axis_aligned_linear_pos", erc.a);

   MapCodec<P> codec();

   static <P extends err> ers<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.o, $$0, () -> $$1);
   }
}
