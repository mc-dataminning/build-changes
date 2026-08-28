import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccm {
   public static bzx<byf> a() {
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$0 -> $$0.group($$0.b(chh.ac))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.b($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof byf $$1xx ? $$1xx : null)
                           .filter(byf::eH)
                           .filter($$1xx -> $$1xx.an() != bxn.bT || $$2.O().c(dkf.P))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
