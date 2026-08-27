import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqp {
   private static final int a = 16;

   public static bnn<blv> a(Predicate<ie<bwz>> $$0, bux<id> $$1) {
      return bqz.a((Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               id $$6 = $$2.b($$2x);
               hv $$7 = $$6.b();
               if ($$3.ad() == $$6.a() && $$7.a($$4.dk(), 16.0)) {
                  amp $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.x().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.x().b($$7);
                     acv.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(amp $$0, hv $$1, blv $$2) {
      dip $$3 = $$0.a_($$1);
      return $$3.a(arr.R) && $$3.c(cvs.c) && !$$2.fD();
   }
}
