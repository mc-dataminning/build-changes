import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxw {
   public static bvk<btq> a(int $$0, BiPredicate<btq, btq> $$1) {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$2 -> $$2.group($$2.b(ccu.o), $$2.a(ccu.ab), $$2.c(ccu.ai), $$2.a(ccu.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     btq $$10 = $$2.b($$3);
                     if (!$$10.eB()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dp(), (long)$$0);
                        if ($$10.ak() != btb.by || $$7.ab().b(dbv.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
