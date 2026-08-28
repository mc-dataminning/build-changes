import com.mojang.serialization.MapCodec;

public interface bqt<P extends bqs> {
   bqt<bqq> a = a("constant", bqq.b);
   bqt<bqz> b = a("uniform", bqz.a);
   bqt<bqo> c = a("clamped_normal", bqo.a);
   bqt<bqy> d = a("trapezoid", bqy.a);

   MapCodec<P> codec();

   static <P extends bqs> bqt<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.J, $$0, () -> $$1);
   }
}
