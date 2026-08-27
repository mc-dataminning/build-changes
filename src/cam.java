import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cam {
   public static bkr<biy> a(int $$0, int $$1) {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$2 -> $$2.group($$2.b(bsa.ac), $$2.b(bsa.K), $$2.a(bsa.ad), $$2.a(bsa.ae))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.eS().b()) {
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
