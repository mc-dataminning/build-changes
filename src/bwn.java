import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwn {
   public static buk<bsz> a(cbu<io> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eum::c);
   }

   public static bvu<bsz> b(cbu<? extends brw> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, brw::dn);
   }

   private static <T> bvu<bsz> a(cbu<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eum> $$4) {
      return bxw.a(
         (Function<bxw.b<bsz>, ? extends App<bxw.c<bsz>, bxz<bsz>>>)($$5 -> $$5.group($$5.a(cbu.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cbx> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eum $$11 = $$8.dn();
                     eum $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jh)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eum $$13 = $$10.get().a().a().d($$11);
                           eum $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eum $$16 = cdo.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cbx($$16, $$1, 0));
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
