import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cpp<E extends cph> {
   public static byr<bwz> a(int $$0) {
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$1 -> $$1.group($$1.b(cgb.ae), $$1.a(cgb.M))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fb().f()) {
                        return false;
                     } else {
                        Optional<cmx> $$7 = $$1.a($$3);
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
