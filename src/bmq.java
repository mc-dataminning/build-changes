import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmq {
   public static bkq<biy> a(bim<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bob.a(
         (Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$2x -> $$2x.group($$2x.a(brz.n), $$2x.c(brz.q), $$2x.b(brz.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<biy> $$9 = $$2x.<bsb>b($$5).a($$3xx -> $$3xx.f((bii)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        biy $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bla($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
