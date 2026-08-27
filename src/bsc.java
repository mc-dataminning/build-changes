import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bsc {
   public static bqq<chn> a() {
      return buc.a(
         (Function<buc.b<chn>, ? extends App<buc.c<chn>, buf<chn>>>)($$0 -> $$0.group($$0.b(bya.c), $$0.b(bya.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ik $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<box>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof chn && $$1xxx != $$4)
                                    .map($$0xxxx -> (chn)$$0xxxx)
                                    .filter(box::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bsc::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static chn a(chn $$0, chn $$1) {
      chn $$2;
      chn $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dM().b(bya.c);
      return $$2;
   }

   private static boolean a(ik $$0, il<cad> $$1, chn $$2) {
      Optional<ik> $$3 = $$2.dM().c(bya.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gw().b());
   }

   private static boolean a(il<cad> $$0, chq $$1) {
      return $$1.b().test($$0);
   }
}
