import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class caq {
   public static bzx<byf> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends byf> bzx<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cdj.a((Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$4 -> {
         cdj<E, ? extends cdk<? extends K1, chk>> $$5 = $$2 ? $$4.a(chh.n) : $$4.c(chh.n);
         return $$4.group($$4.a(chh.o), $$5, $$4.b(chh.M), $$4.a(chh.aQ)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               coo $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().E_().a($$11.dv()) && $$9.fN()) {
                  chk $$12 = new chk(new cah($$11, false), $$1, 0);
                  $$4x.a(new cah($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
