import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bso {
   private static final int a = 1;

   public static brh<bpo> a(float $$0) {
      return but.a(
         (Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$1 -> $$1.group($$1.a(byr.n), $$1.c(byr.m), $$1.b(byr.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        bow $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new brr($$8, true));
                           $$3.a(new byu(new brr($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
