import com.mojang.serialization.MapCodec;

public interface bqo<P extends bqn> {
   bqo<bql> a = a("constant", bql.b);
   bqo<bqu> b = a("uniform", bqu.a);
   bqo<bqj> c = a("clamped_normal", bqj.a);
   bqo<bqt> d = a("trapezoid", bqt.a);

   MapCodec<P> codec();

   static <P extends bqn> bqo<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.J, $$0, () -> $$1);
   }
}
