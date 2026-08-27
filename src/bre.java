import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bre {
   private static final int a = 16;

   public static boc<bmk> a(Predicate<ih<bxo>> $$0, bvm<ig> $$1) {
      return bro.a((Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ig $$6 = $$2.b($$2x);
               hx $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dk(), 16.0)) {
                  and $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     adi.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(and $$0, hx $$1, bmk $$2) {
      djg $$3 = $$0.a_($$1);
      return $$3.a(asg.R) && $$3.c(cwi.c) && !$$2.fD();
   }
}
