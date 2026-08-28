import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzk {
   public static byr<bwz> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bwz> byr<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return ccd.a((Function<ccd.b<E>, ? extends App<ccd.c<E>, ccg<E>>>)($$4 -> {
         ccd<E, ? extends cce<? extends K1, cge>> $$5 = $$2 ? $$4.a(cgb.n) : $$4.c(cgb.n);
         return $$4.group($$4.a(cgb.o), $$5, $$4.b(cgb.M), $$4.a(cgb.aQ)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cmx $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().A_().a($$11.dv()) && $$9.fM()) {
                  cge $$12 = new cge(new bzb($$11, false), $$1, 0);
                  $$4x.a(new bzb($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
