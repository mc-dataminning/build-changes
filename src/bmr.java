import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmr {
   public static bkp<bjf> a(bry<gv> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ehf::c);
   }

   public static bly<bjf> b(bry<? extends big> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, big::di);
   }

   private static <T> bly<bjf> a(bry<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ehf> $$4) {
      return boa.a(
         (Function<boa.b<bjf>, ? extends App<boa.c<bjf>, bod<bjf>>>)($$5 -> $$5.group($$5.a(bry.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bsb> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ehf $$11 = $$8.di();
                     ehf $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((hp)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ehf $$13 = $$10.get().a().a().d($$11);
                           ehf $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ehf $$16 = btq.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bsb($$16, $$1, 0));
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
