import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cac {
   public static bxz<bwn> a(cfj<jh> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fbx::c);
   }

   public static bzj<bwn> b(cfj<? extends bvj> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bvj::dt);
   }

   private static <T> bzj<bwn> a(cfj<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fbx> $$4) {
      return cbl.a(
         (Function<cbl.b<bwn>, ? extends App<cbl.c<bwn>, cbo<bwn>>>)($$5 -> $$5.group($$5.a(cfj.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cfm> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fbx $$11 = $$8.dt();
                     fbx $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ka)$$12, (double)$$2)) {
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
                           fbx $$16 = chd.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cfm($$16, $$1, 0));
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
