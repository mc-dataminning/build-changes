import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzb {
   private static final int a = 10;
   private static final int b = 7;

   public static bxi<bun> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bxi<bun> a(float $$0, int $$1, int $$2) {
      return bzk.a((Function<bzk.b<bun>, ? extends App<bzk.c<bun>, bzn<bun>>>)($$3 -> $$3.group($$3.c(cdi.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               je $$7 = $$5.ds();
               eye $$8;
               if ($$4.c($$7)) {
                  $$8 = cfc.a($$5, $$1, $$2);
               } else {
                  kg $$9 = kg.a($$7);
                  kg $$10 = bvz.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cez.a($$5, $$1, $$2, eye.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cfc.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cdl($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
