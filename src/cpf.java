import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cpf<E extends cox> {
   public static byj<bwr> a(int $$0) {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$1 -> $$1.group($$1.b(cft.ae), $$1.a(cft.M))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fb().f()) {
                        return false;
                     } else {
                        Optional<cmn> $$7 = $$1.a($$3);
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
