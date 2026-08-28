import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bwq {
   public static bws<btn> a(float $$0) {
      return byu.a((Function<byu.b<btn>, ? extends App<byu.c<btn>, byx<btn>>>)($$1 -> $$1.group($$1.c(ccs.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.do())) {
                  return false;
               } else {
                  Optional<exc> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new ccv($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static exc a(aqu $$0, btn $$1) {
      ayw $$2 = $$1.dR();
      jd $$3 = $$1.do();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jd $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return exc.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqu $$0, btn $$1, jd $$2) {
      return $$0.h($$2) && (double)$$0.a(dyy.a.e, $$2).v() <= $$1.dv();
   }
}
