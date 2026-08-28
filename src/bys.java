import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bys {
   public static buv<btb> a() {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$0 -> $$0.group($$0.a(ccf.n), $$0.a(ccf.az), $$0.a(ccf.ay), $$0.c(ccf.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ja> $$7 = $$0.<btb>a($$3).map(bsg::dq).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bux($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
