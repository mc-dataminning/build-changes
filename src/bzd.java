import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzd {
   public static bvg<btl> a() {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$0 -> $$0.group($$0.a(ccq.n), $$0.a(ccq.az), $$0.a(ccq.ay), $$0.c(ccq.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<jd> $$7 = $$0.<btl>a($$3).map(bsq::dq).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bvi($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
