import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmn {
   public static bkq<biy> a(bjb $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag().f()), $$1);
   }

   public static blz<biy> a(bim<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag()), $$1);
   }

   public static blz<biy> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static blz<biy> a(Predicate<biy> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bob.a(
         (Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$2x -> $$2x.group($$2x.c(brz.n), $$2x.b(brz.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<biy> $$8 = $$2x.<bsb>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bii)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bla($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
