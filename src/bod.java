import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bod {
   public static bmb<bks> a(btk<ht> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eif::c);
   }

   public static bnk<bks> b(btk<? extends bjt> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bjt::dj);
   }

   private static <T> bnk<bks> a(btk<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eif> $$4) {
      return bpm.a(
         (Function<bpm.b<bks>, ? extends App<bpm.c<bks>, bpp<bks>>>)($$5 -> $$5.group($$5.a(btk.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<btn> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eif $$11 = $$8.dj();
                     eif $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((im)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eif $$13 = $$10.get().a().a().d($$11);
                           eif $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eif $$16 = bvc.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new btn($$16, $$1, 0));
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
