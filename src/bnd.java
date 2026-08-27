import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnd {
   public static bmh<bjg> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bmh<bjg> a(Predicate<bjg> $$0, Function<bjg, Float> $$1, int $$2) {
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$3 -> $$3.group($$3.c(bsh.m), $$3.b(bsh.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new bsk($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
