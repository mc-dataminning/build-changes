import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bys {
   public static bwd<buk> a() {
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$0 -> $$0.group($$0.b(cdn.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof buk $$1xx ? $$1xx : null)
                           .filter(buk::eB)
                           .filter($$1xx -> $$1xx.ao() != btv.by || $$2.ac().b(dec.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
