import com.mojang.serialization.MapCodec;

public interface btc<P extends btb> {
   btc<bsz> a = a("constant", bsz.b);
   btc<bti> b = a("uniform", bti.a);
   btc<bsx> c = a("clamped_normal", bsx.a);
   btc<bth> d = a("trapezoid", bth.a);

   MapCodec<P> codec();

   static <P extends btb> btc<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.J, $$0, () -> $$1);
   }
}
