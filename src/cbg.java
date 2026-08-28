import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbg {
   public static byr<bwz> a() {
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$0 -> $$0.group($$0.b(cgb.ac))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.b($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bwz $$1xx ? $$1xx : null)
                           .filter(bwz::eG)
                           .filter($$1xx -> $$1xx.aq() != bwj.bS || $$2.O().c(dil.O))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
