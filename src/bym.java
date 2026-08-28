import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bym {
   public static bxq<bun> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bxq<bun> a(Predicate<bun> $$0, Function<bun, Float> $$1, int $$2) {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$3 -> $$3.group($$3.c(cdq.m), $$3.b(cdq.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cdt($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
