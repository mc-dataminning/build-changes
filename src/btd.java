import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class btd {
   public static bqq<box> a(Function<box, Optional<bsd>> $$0, Predicate<box> $$1, int $$2, int $$3, float $$4) {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$5 -> $$5.group($$5.a(bya.n), $$5.a(bya.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bsd> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bsd $$11 = $$10.get();
                        if ($$8.dh().a((iv)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bsd $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new byd($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
