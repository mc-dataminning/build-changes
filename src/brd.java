import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brd {
   public static bsr<bor> a(bmn $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bsr<bor> a(bmn $$0, Function<bpo, Float> $$1) {
      return but.a(
         (Function<but.b<bor>, ? extends App<but.c<bor>, buw<bor>>>)($$2 -> $$2.group($$2.b(byr.K), $$2.a(byr.n), $$2.c(byr.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bor $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           byu $$10 = new byu(new brr($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new brr($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
