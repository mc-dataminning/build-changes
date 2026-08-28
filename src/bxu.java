import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxu {
   private static final int a = 16;

   public static bus<bsy> a(Predicate<jj<cef>> $$0, ccc<ji> $$1) {
      return bye.a((Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ji $$6 = $$2.b($$2x);
               ja $$7 = $$6.b();
               if ($$3.af() == $$6.a() && $$7.a($$4.dn(), 16.0)) {
                  aqk $$8 = $$3.o().a($$6.a());
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

   private static boolean a(aqk $$0, ja $$1, bsy $$2) {
      dsh $$3 = $$0.a_($$1);
      return $$3.a(avu.R) && $$3.c(dey.c) && !$$2.fH();
   }
}
