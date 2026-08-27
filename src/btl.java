import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class btl {
   public static bri<bpx> a(bys<ib> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ept::c);
   }

   public static bss<bpx> b(bys<? extends box> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, box::dk);
   }

   private static <T> bss<bpx> a(bys<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ept> $$4) {
      return buu.a(
         (Function<buu.b<bpx>, ? extends App<buu.c<bpx>, bux<bpx>>>)($$5 -> $$5.group($$5.a(bys.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<byv> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ept $$11 = $$8.dk();
                     ept $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((iv)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ept $$13 = $$10.get().a().a().d($$11);
                           ept $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ept $$16 = cam.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new byv($$16, $$1, 0));
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
