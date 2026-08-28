import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byj {
   private static final int a = 1;

   public static bxc<bvi> a(float $$0) {
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$1 -> $$1.group($$1.a(cem.n), $$1.c(cem.m), $$1.b(cem.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bum $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bxm($$8, true));
                           $$3.a(new cep(new bxm($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
