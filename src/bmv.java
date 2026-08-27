import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmv {
   public static blz<biy> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static blz<biy> a(Predicate<biy> $$0, Function<biy, Float> $$1, int $$2) {
      return bob.a(
         (Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$3 -> $$3.group($$3.c(brz.m), $$3.b(brz.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new bsc($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
