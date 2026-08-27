import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class buk {
   private static final int a = 16;

   public static bri<bpp> a(Predicate<il<cav>> $$0, bys<ik> $$1) {
      return buu.a((Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
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

   private static boolean a(apf $$0, ib $$1, bpp $$2) {
      dnb $$3 = $$0.a_($$1);
      return $$3.a(aun.R) && $$3.c(czv.c) && !$$2.fI();
   }
}
