import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byj {
   public static bxn<buk> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bxn<buk> a(Predicate<buk> $$0, Function<buk, Float> $$1, int $$2) {
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$3 -> $$3.group($$3.c(cdn.m), $$3.b(cdn.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cdq($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
