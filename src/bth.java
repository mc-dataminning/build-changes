import com.mojang.serialization.MapCodec;

public interface bth<P extends btg> {
   bth<bte> a = a("constant", bte.b);
   bth<btn> b = a("uniform", btn.a);
   bth<btc> c = a("clamped_normal", btc.a);
   bth<btm> d = a("trapezoid", btm.a);

   MapCodec<P> codec();

   static <P extends btg> bth<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.J, $$0, () -> $$1);
   }
}
