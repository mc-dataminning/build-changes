import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bkg {
   public static bhs<bfz> a() {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$0 -> $$0.group($$0.b(bpb.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bfz $$1xx ? $$1xx : null)
                           .filter(bfz::es)
                           .filter($$1xx -> $$1xx.ae() != bfn.bt || $$2.X().b(cmi.J))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
