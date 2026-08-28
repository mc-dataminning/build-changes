import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxj {
   public static bvg<btu> a(ccq<jd> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eww::c);
   }

   public static bwq<btu> b(ccq<? extends bsq> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bsq::do);
   }

   private static <T> bwq<btu> a(ccq<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eww> $$4) {
      return bys.a(
         (Function<bys.b<btu>, ? extends App<bys.c<btu>, byv<btu>>>)($$5 -> $$5.group($$5.a(ccq.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cct> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eww $$11 = $$8.do();
                     eww $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jw)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eww $$13 = $$10.get().a().a().d($$11);
                           eww $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eww $$16 = cek.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cct($$16, $$1, 0));
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
