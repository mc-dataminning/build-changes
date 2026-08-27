import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bpj {
   public static bnx<ceo> a() {
      return brj.a(
         (Function<brj.b<ceo>, ? extends App<brj.c<ceo>, brm<ceo>>>)($$0 -> $$0.group($$0.b(bvh.c), $$0.b(bvh.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ig $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bmf>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof ceo && $$1xxx != $$4)
                                    .map($$0xxxx -> (ceo)$$0xxxx)
                                    .filter(bmf::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bpj::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static ceo a(ceo $$0, ceo $$1) {
      ceo $$2;
      ceo $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dO().b(bvh.c);
      return $$2;
   }

   private static boolean a(ig $$0, ih<bxj> $$1, ceo $$2) {
      Optional<ig> $$3 = $$2.dO().c(bvh.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gp().b());
   }

   private static boolean a(ih<bxj> $$0, cer $$1) {
      return $$1.b().test($$0);
   }
}
