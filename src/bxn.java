import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxn {
   public static bwr<btn> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bwr<btn> a(Predicate<btn> $$0, Function<btn, Float> $$1, int $$2) {
      return byt.a(
         (Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$3 -> $$3.group($$3.c(ccr.m), $$3.b(ccr.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new ccu($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
