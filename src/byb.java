import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byb {
   public static bwp<cnt> a() {
      return cab.a(
         (Function<cab.b<cnt>, ? extends App<cab.c<cnt>, cae<cnt>>>)($$0 -> $$0.group($$0.b(cdz.c), $$0.b(cdz.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jo $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<buv>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cnt && $$1xxx != $$4)
                                    .map($$0xxxx -> (cnt)$$0xxxx)
                                    .filter(buv::bM)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, byb::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cnt a(cnt $$0, cnt $$1) {
      cnt $$2;
      cnt $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ed().b(cdz.c);
      return $$2;
   }

   private static boolean a(jo $$0, jp<cgc> $$1, cnt $$2) {
      Optional<jo> $$3 = $$2.ed().c(cdz.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gF().b());
   }

   private static boolean a(jp<cgc> $$0, cnw $$1) {
      return $$1.b().test($$0);
   }
}
