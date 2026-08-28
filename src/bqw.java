import com.mojang.serialization.MapCodec;

public interface bqw<P extends bqv> {
   bqw<bqt> a = a("constant", bqt.b);
   bqw<brc> b = a("uniform", brc.a);
   bqw<bqr> c = a("clamped_normal", bqr.a);
   bqw<brb> d = a("trapezoid", brb.a);

   MapCodec<P> codec();

   static <P extends bqv> bqw<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.J, $$0, () -> $$1);
   }
}
