import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxe {
   public static bus<bsy> a(int $$0, BiPredicate<bsy, bsy> $$1) {
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$2 -> $$2.group($$2.b(ccc.o), $$2.a(ccc.ab), $$2.c(ccc.ai), $$2.a(ccc.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bsy $$10 = $$2.b($$3);
                     if (!$$10.ex()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dp(), (long)$$0);
                        if ($$10.ak() != bsj.by || $$7.ab().b(dbz.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
