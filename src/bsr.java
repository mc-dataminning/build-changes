import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsr {
   public static bqq<box> a(bol<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$2x -> $$2x.group($$2x.a(bya.n), $$2x.c(bya.q), $$2x.b(bya.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<box> $$9 = $$2x.<byc>b($$5).a($$3xx -> $$3xx.f((bof)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        box $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bra($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
