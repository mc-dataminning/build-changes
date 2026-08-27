import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cal<E extends cad> {
   public static bkr<biy> a(int $$0) {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$1 -> $$1.group($$1.b(bsa.ac), $$1.a(bsa.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eS().b()) {
                        return false;
                     } else {
                        Optional<byg> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
