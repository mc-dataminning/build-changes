import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byg {
   private static final int a = 1;

   public static bwz<bvf> a(float $$0) {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$1 -> $$1.group($$1.a(cej.n), $$1.c(cej.m), $$1.b(cej.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        buj $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bxj($$8, true));
                           $$3.a(new cem(new bxj($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
