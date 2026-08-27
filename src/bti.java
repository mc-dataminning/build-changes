import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bti {
   public static bpx<cgu> a(float $$0) {
      return btj.a(
         (Function<btj.b<cgu>, ? extends App<btj.c<cgu>, btm<cgu>>>)($$1 -> $$1.group($$1.b(bxh.d), $$1.c(bxh.c), $$1.b(bxh.g), $$1.a(bxh.m), $$1.a(bxh.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gr().b() != cgx.b) {
                           return false;
                        } else {
                           hz $$9 = $$1.<ii>b($$2).b();
                           Optional<ij<bzk>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bog>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cgu && $$1xxx != $$7)
                                 .map($$0xxxx -> (cgu)$$0xxxx)
                                 .filter(bog::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dO().c(bxh.c).isEmpty()) {
                                       bpy.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dO().a(bxh.d, ii.a($$6x.ae(), $$9));
                                       aep.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ij<bzk> $$0, cgu $$1, hz $$2) {
      boolean $$3 = $$1.dO().c(bxh.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ii> $$4 = $$1.dO().c(bxh.c);
         cgx $$5 = $$1.gr().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(boo $$0, hz $$1, bzk $$2) {
      ehe $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
