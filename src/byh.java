import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byh {
   private static final int a = 1;

   public static bwd<bum> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bwd<bum> a(Function<buk, Float> $$0) {
      return bzp.a(
         (Function<bzp.b<bum>, ? extends App<bzp.c<bum>, bzs<bum>>>)($$1 -> $$1.group($$1.a(cdn.m), $$1.a(cdn.n), $$1.b(cdn.o), $$1.a(cdn.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     buk $$9 = $$1.b($$4);
                     Optional<cdp> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bwe.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bwn($$9, true));
                        $$2.a(new cdq(new bwn($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
