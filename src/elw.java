import com.mojang.serialization.MapCodec;

public interface elw<P extends elv> {
   elw<elu> a = a("always_true", elu.a);
   elw<els> b = a("linear_pos", els.a);
   elw<elh> c = a("axis_aligned_linear_pos", elh.a);

   MapCodec<P> codec();

   static <P extends elv> elw<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.q, $$0, () -> $$1);
   }
}
