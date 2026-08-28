import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzj {
   public static bwu<bva> a() {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$0 -> $$0.group($$0.b(cee.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bva $$1xx ? $$1xx : null)
                           .filter(bva::eH)
                           .filter($$1xx -> $$1xx.ar() != bul.by || $$2.ac().b(dex.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
