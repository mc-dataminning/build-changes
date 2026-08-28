import com.mojang.serialization.MapCodec;

public interface epr<P extends epq> {
   epr<epp> a = a("always_true", epp.a);
   epr<epm> b = a("linear_pos", epm.a);
   epr<epb> c = a("axis_aligned_linear_pos", epb.a);

   MapCodec<P> codec();

   static <P extends epq> epr<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.o, $$0, () -> $$1);
   }
}
