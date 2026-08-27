import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekk {
   private static final Codec<ekj> f = kd.I.q().dispatch(ekj::b, eki::a);
   public static final Codec<ekj> a = atq.a(
      (Supplier<Codec<ekj>>)(() -> {
         Codec<ekj> $$0 = atq.e(f, ekm.a);
         return Codec.either(ekh.b, $$0)
            .xmap($$0x -> (ekj)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof ekh $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eki b = a("constant", ekh.a);
   public static final eki c = a("uniform", ekm.a);
   public static final eki d = a("binomial", ekg.a);
   public static final eki e = a("score", ekl.a);

   private static eki a(String $$0, Codec<? extends ekj> $$1) {
      return it.a(kd.I, new ahd($$0), new eki($$1));
   }
}
