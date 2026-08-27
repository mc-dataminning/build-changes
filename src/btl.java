import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class btl {
   private static final int a = 1;

   public static brh<bpq> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static brh<bpq> a(Function<bpo, Float> $$0) {
      return but.a(
         (Function<but.b<bpq>, ? extends App<but.c<bpq>, buw<bpq>>>)($$1 -> $$1.group($$1.a(byr.m), $$1.a(byr.n), $$1.b(byr.o), $$1.a(byr.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bpo $$9 = $$1.b($$4);
                     Optional<byt> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bri.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new brr($$9, true));
                        $$2.a(new byu(new brr($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
