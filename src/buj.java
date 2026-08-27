import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class buj {
   private static final int a = 16;

   public static brh<bpo> a(Predicate<il<cau>> $$0, byr<ik> $$1) {
      return but.a((Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ik $$6 = $$2.b($$2x);
               ib $$7 = $$6.b();
               if ($$3.ad() == $$6.a() && $$7.a($$4.dk(), 16.0)) {
                  apf $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     aew.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(apf $$0, ib $$1, bpo $$2) {
      dmz $$3 = $$0.a_($$1);
      return $$3.a(aun.R) && $$3.c(czt.c) && !$$2.fI();
   }
}
