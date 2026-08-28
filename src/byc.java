import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byc {
   private static final int a = 1;

   public static bvy<buh> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bvy<buh> a(Function<buf, Float> $$0) {
      return bzk.a(
         (Function<bzk.b<buh>, ? extends App<bzk.c<buh>, bzn<buh>>>)($$1 -> $$1.group($$1.a(cdi.m), $$1.a(cdi.n), $$1.b(cdi.o), $$1.a(cdi.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     buf $$9 = $$1.b($$4);
                     Optional<cdk> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bvz.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bwi($$9, true));
                        $$2.a(new cdl(new bwi($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
