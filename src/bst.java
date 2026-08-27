import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bst {
   public static bqq<bpf> a(bya<ib> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eov::c);
   }

   public static bsa<bpf> b(bya<? extends bof> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bof::dh);
   }

   private static <T> bsa<bpf> a(bya<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eov> $$4) {
      return buc.a(
         (Function<buc.b<bpf>, ? extends App<buc.c<bpf>, buf<bpf>>>)($$5 -> $$5.group($$5.a(bya.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<byd> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eov $$11 = $$8.dh();
                     eov $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((iv)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eov $$13 = $$10.get().a().a().d($$11);
                           eov $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eov $$16 = bzu.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new byd($$16, $$1, 0));
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
