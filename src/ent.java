import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ent {
   private static final Codec<ens> f = kh.I.q().dispatch(ens::b, enr::a);
   public static final Codec<ens> a = avu.a(
      (Supplier<Codec<ens>>)(() -> {
         Codec<ens> $$0 = avu.e(f, env.a);
         return Codec.either(enq.b, $$0)
            .xmap($$0x -> (ens)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof enq $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final enr b = a("constant", enq.a);
   public static final enr c = a("uniform", env.a);
   public static final enr d = a("binomial", enp.a);
   public static final enr e = a("score", enu.a);

   private static enr a(String $$0, Codec<? extends ens> $$1) {
      return ix.a(kh.I, new ajc($$0), new enr($$1));
   }
}
