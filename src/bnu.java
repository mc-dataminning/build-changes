import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnu {
   private static final int a = 16;

   public static bkt<bjb> a(Predicate<hg<bud>> $$0, bsc<hf> $$1) {
      return boe.a((Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               hf $$6 = $$2.b($$2x);
               gw $$7 = $$6.b();
               if ($$3.ac() == $$6.a() && $$7.a($$4.di(), 16.0)) {
                  akn $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.w().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.w().b($$7);
                     aay.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(akn $$0, gw $$1, bjb $$2) {
      dfe $$3 = $$0.a_($$1);
      return $$3.a(apo.R) && $$3.c(csj.b) && !$$2.fB();
   }
}
