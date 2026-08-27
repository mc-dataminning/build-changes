import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class brz {
   public static boc<bmk> a() {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$0 -> $$0.group($$0.a(bvm.n), $$0.a(bvm.ay), $$0.a(bvm.ax), $$0.c(bvm.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<hx> $$7 = $$0.<bmk>a($$3).map(blu::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new boe($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
