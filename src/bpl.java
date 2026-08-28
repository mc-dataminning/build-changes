import com.mojang.serialization.MapCodec;

public interface bpl<P extends bpk> {
   bpl<bpi> a = a("constant", bpi.b);
   bpl<bpr> b = a("uniform", bpr.a);
   bpl<bpg> c = a("clamped_normal", bpg.a);
   bpl<bpq> d = a("trapezoid", bpq.a);

   MapCodec<P> codec();

   static <P extends bpk> bpl<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.J, $$0, () -> $$1);
   }
}
