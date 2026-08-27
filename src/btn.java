import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class btn {
   public static bsr<bpo> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bsr<bpo> a(Predicate<bpo> $$0, Function<bpo, Float> $$1, int $$2) {
      return but.a(
         (Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$3 -> $$3.group($$3.c(byr.m), $$3.b(byr.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new byu($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
