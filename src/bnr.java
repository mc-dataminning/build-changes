import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnr {
   private static final int a = 16;

   public static bkq<biy> a(Predicate<he<bua>> $$0, brz<hd> $$1) {
      return bob.a((Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               hd $$6 = $$2.b($$2x);
               gu $$7 = $$6.b();
               if ($$3.ac() == $$6.a() && $$7.a($$4.di(), 16.0)) {
                  akk $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.w().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.w().b($$7);
                     aav.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(akk $$0, gu $$1, biy $$2) {
      dez $$3 = $$0.a_($$1);
      return $$3.a(apl.R) && $$3.c(cse.b) && !$$2.fB();
   }
}
