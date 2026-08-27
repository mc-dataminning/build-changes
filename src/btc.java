import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class btc {
   public static bqq<box> a(int $$0, BiPredicate<box, box> $$1) {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$2 -> $$2.group($$2.b(bya.o), $$2.a(bya.ab), $$2.c(bya.ai), $$2.a(bya.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     box $$10 = $$2.b($$3);
                     if (!$$10.ev()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dj(), (long)$$0);
                        if ($$10.ai() != bol.bw || $$7.Z().b(cwa.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
