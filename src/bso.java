import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bso {
   public static bqb<boi> a(Function<boi, Optional<bro>> $$0, Predicate<boi> $$1, int $$2, int $$3, float $$4) {
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$5 -> $$5.group($$5.a(bxl.n), $$5.a(bxl.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bro> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bro $$11 = $$10.get();
                        if ($$8.dk().a((it)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bro $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bxo($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
