import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzv {
   public static bxs<bwg> a(cfc<ji> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fbx::c);
   }

   public static bzc<bwg> b(cfc<? extends bva> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bva::ds);
   }

   private static <T> bzc<bwg> a(cfc<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fbx> $$4) {
      return cbe.a(
         (Function<cbe.b<bwg>, ? extends App<cbe.c<bwg>, cbh<bwg>>>)($$5 -> $$5.group($$5.a(cfc.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cff> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fbx $$11 = $$8.ds();
                     fbx $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((kb)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fbx $$13 = $$10.get().a().a().d($$11);
                           fbx $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fbx $$16 = cgw.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cff($$16, $$1, 0));
                              break;
                           }
                        }

                        return true;
                     }
                  }
               }))
      );
   }
}
