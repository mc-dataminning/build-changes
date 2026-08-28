import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class crf<E extends cqx> {
   public static bzx<byf> a(int $$0) {
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$1 -> $$1.group($$1.b(chh.ae), $$1.a(chh.M))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fc().f()) {
                        return false;
                     } else {
                        Optional<coo> $$7 = $$1.a($$3);
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
