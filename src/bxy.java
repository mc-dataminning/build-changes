import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxy {
   private static final int a = 16;

   public static buw<btc> a(Predicate<jj<cej>> $$0, ccg<ji> $$1) {
      return byi.a((Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ji $$6 = $$2.b($$2x);
               ja $$7 = $$6.b();
               if ($$3.af() == $$6.a() && $$7.a($$4.dp(), 16.0)) {
                  aqm $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     afy.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aqm $$0, ja $$1, btc $$2) {
      dsl $$3 = $$0.a_($$1);
      return $$3.a(avw.R) && $$3.c(dfb.c) && !$$2.fJ();
   }
}
