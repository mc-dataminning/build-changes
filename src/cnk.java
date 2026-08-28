import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cnk {
   public static bwu<bva> a(int $$0, int $$1) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$2 -> $$2.group($$2.b(cee.ad), $$2.b(cee.L), $$2.a(cee.ae), $$2.a(cee.af))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.fc().f()) {
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
