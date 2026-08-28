import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cau {
   public static byr<bxh> a(cgb<iu> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fdw::c);
   }

   public static cab<bxh> b(cgb<? extends bwa> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bwa::dt);
   }

   private static <T> cab<bxh> a(cgb<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fdw> $$4) {
      return ccd.a(
         (Function<ccd.b<bxh>, ? extends App<ccd.c<bxh>, ccg<bxh>>>)($$5 -> $$5.group($$5.a(cgb.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cge> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fdw $$11 = $$8.dt();
                     fdw $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jo)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fdw $$13 = $$10.get().a().a().d($$11);
                           fdw $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fdw $$16 = chv.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cge($$16, $$1, 0));
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
