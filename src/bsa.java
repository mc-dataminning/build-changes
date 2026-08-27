import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsa {
   public static bpx<boo> a(bxh<hz> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ens::c);
   }

   public static brh<boo> b(bxh<? extends bno> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bno::dk);
   }

   private static <T> brh<boo> a(bxh<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ens> $$4) {
      return btj.a(
         (Function<btj.b<boo>, ? extends App<btj.c<boo>, btm<boo>>>)($$5 -> $$5.group($$5.a(bxh.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bxk> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ens $$11 = $$8.dk();
                     ens $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((it)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ens $$13 = $$10.get().a().a().d($$11);
                           ens $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ens $$16 = bzb.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bxk($$16, $$1, 0));
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
