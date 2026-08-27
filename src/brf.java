import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class brf {
   private static final int a = 16;

   public static bod<bml> a(Predicate<ih<bxp>> $$0, bvn<ig> $$1) {
      return brp.a((Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
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

   private static boolean a(and $$0, hx $$1, bml $$2) {
      djh $$3 = $$0.a_($$1);
      return $$3.a(ash.R) && $$3.c(cwj.c) && !$$2.fD();
   }
}
