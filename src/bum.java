import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bum {
   public static btt<bsa> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bsa> btt<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bxf.a((Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$4 -> {
         bxf<E, ? extends bxg<? extends K1, cbg>> $$5 = $$2 ? $$4.a(cbd.m) : $$4.c(cbd.m);
         return $$4.group($$4.a(cbd.n), $$5, $$4.b(cbd.L), $$4.a(cbd.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               chr $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dN().C_().a($$11.dn())) {
                  cbg $$12 = new cbg(new bud($$11, false), $$1, 0);
                  $$4x.a(new bud($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
