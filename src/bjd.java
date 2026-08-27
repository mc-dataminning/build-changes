import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bjd {
   public static bhs<byb> a() {
      return bld.a(
         (Function<bld.b<byb>, ? extends App<bld.c<byb>, blg<byb>>>)($$0 -> $$0.group($$0.b(bpb.c), $$0.b(bpb.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hd $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bfz>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof byb && $$1xxx != $$4)
                                    .map($$0xxxx -> (byb)$$0xxxx)
                                    .filter(bfz::bs)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bjd::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static byb a(byb $$0, byb $$1) {
      byb $$2;
      byb $$3;
      if ($$0.r() > $$1.r()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dK().b(bpb.c);
      return $$2;
   }

   private static boolean a(hd $$0, he<brc> $$1, byb $$2) {
      Optional<hd> $$3 = $$2.dK().c(bpb.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gj().b());
   }

   private static boolean a(he<brc> $$0, bye $$1) {
      return $$1.b().test($$0);
   }
}
