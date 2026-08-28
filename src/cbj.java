import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cbj {
   public static bzx<cru> a() {
      return cdj.a(
         (Function<cdj.b<cru>, ? extends App<cdj.c<cru>, cdm<cru>>>)($$0 -> $$0.group($$0.b(chh.c), $$0.b(chh.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jf $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<byf>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cru && $$1xxx != $$4)
                                    .map($$0xxxx -> (cru)$$0xxxx)
                                    .filter(byf::bJ)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, cbj::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cru a(cru $$0, cru $$1) {
      cru $$2;
      cru $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ec().b(chh.c);
      return $$2;
   }

   private static boolean a(jf $$0, jg<cjk> $$1, cru $$2) {
      Optional<jf> $$3 = $$2.ec().c(chh.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gC().b());
   }

   private static boolean a(jg<cjk> $$0, jg<crx> $$1) {
      return $$1.a().b().test($$0);
   }
}
