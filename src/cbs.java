import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbs {
   public static bxv<bwb> a() {
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$0 -> $$0.group($$0.a(cff.n), $$0.a(cff.az), $$0.a(cff.ay), $$0.c(cff.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<jh> $$7 = $$0.<bwb>a($$3).map(bvf::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bxx($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
