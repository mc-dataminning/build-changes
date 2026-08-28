import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzg {
   private static final int a = 10;
   private static final int b = 7;

   public static bxn<bus> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bxn<bus> a(float $$0, int $$1, int $$2) {
      return bzp.a((Function<bzp.b<bus>, ? extends App<bzp.c<bus>, bzs<bus>>>)($$3 -> $$3.group($$3.c(cdn.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               je $$7 = $$5.ds();
               eys $$8;
               if ($$4.c($$7)) {
                  $$8 = cfh.a($$5, $$1, $$2);
               } else {
                  kg $$9 = kg.a($$7);
                  kg $$10 = bwe.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cfe.a($$5, $$1, $$2, eys.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cfh.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cdq($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
