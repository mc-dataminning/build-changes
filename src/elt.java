import com.mojang.serialization.MapCodec;

public interface elt<P extends els> {
   elt<elr> a = a("always_true", elr.a);
   elt<elp> b = a("linear_pos", elp.a);
   elt<ele> c = a("axis_aligned_linear_pos", ele.a);

   MapCodec<P> codec();

   static <P extends els> elt<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.q, $$0, () -> $$1);
   }
}
