import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnq {
   private static final int a = 16;

   public static bkp<biw> a(Predicate<hf<btz>> $$0, bry<he> $$1) {
      return boa.a((Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               he $$6 = $$2.b($$2x);
               gv $$7 = $$6.b();
               if ($$3.ac() == $$6.a() && $$7.a($$4.di(), 16.0)) {
                  aki $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.w().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.w().b($$7);
                     aau.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aki $$0, gv $$1, biw $$2) {
      dey $$3 = $$0.a_($$1);
      return $$3.a(apj.R) && $$3.c(csd.b) && !$$2.fB();
   }
}
