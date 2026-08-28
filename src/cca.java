import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cca {
   public static bzx<byn> a(chh<iw> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fgc::c);
   }

   public static cbh<byn> b(chh<? extends bxe> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bxe::dt);
   }

   private static <T> cbh<byn> a(chh<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fgc> $$4) {
      return cdj.a(
         (Function<cdj.b<byn>, ? extends App<cdj.c<byn>, cdm<byn>>>)($$5 -> $$5.group($$5.a(chh.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<chk> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fgc $$11 = $$8.dt();
                     fgc $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jq)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fgc $$13 = $$10.get().a().a().d($$11);
                           fgc $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fgc $$16 = cjb.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new chk($$16, $$1, 0));
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
