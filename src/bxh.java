import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxh {
   public static bve<btt> a(cco<iz> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, evm::c);
   }

   public static bwo<btt> b(cco<? extends bsp> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bsp::dn);
   }

   private static <T> bwo<btt> a(cco<T> $$0, float $$1, int $$2, boolean $$3, Function<T, evm> $$4) {
      return byq.a(
         (Function<byq.b<btt>, ? extends App<byq.c<btt>, byt<btt>>>)($$5 -> $$5.group($$5.a(cco.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<ccr> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     evm $$11 = $$8.dn();
                     evm $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((js)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           evm $$13 = $$10.get().a().a().d($$11);
                           evm $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           evm $$16 = cei.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new ccr($$16, $$1, 0));
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
