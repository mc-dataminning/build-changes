import com.mojang.serialization.MapCodec;

public interface eqt<P extends eqs> {
   eqt<eqq> a = a("clear", eqq.a);
   eqt<eqr> b = a("passthrough", eqr.b);
   eqt<eqp> c = a("append_static", eqp.a);
   eqt<eqo> d = a("append_loot", eqo.a);

   MapCodec<P> codec();

   private static <P extends eqs> eqt<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.n, $$0, () -> $$1);
   }
}
