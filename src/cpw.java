import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cpw {
   public static byu<bxc> a(int $$0, int $$1) {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$2 -> $$2.group($$2.b(cge.ae), $$2.b(cge.M), $$2.a(cge.af), $$2.a(cge.ag))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.fb().f()) {
                        return false;
                     } else {
                        Optional<Integer> $$9 = $$2.a($$5);
                        if ($$9.isEmpty()) {
                           $$5.a(0);
                        } else {
                           int $$10 = $$9.get();
                           if ($$10 > $$0) {
                              $$3.b();
                              $$5.b();
                              $$6.a(true, (long)$$1);
                           } else {
                              $$5.a($$10 + 1);
                           }
                        }

                        return true;
                     }
                  }))
      );
   }
}
