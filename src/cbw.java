import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbw {
   public static bmb<bkj> a(int $$0, int $$1) {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$2 -> $$2.group($$2.b(btk.ac), $$2.b(btk.K), $$2.a(btk.ad), $$2.a(btk.ae))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.eT().b()) {
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
