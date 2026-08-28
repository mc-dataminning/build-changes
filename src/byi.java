import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byi {
   private static final int a = 16;

   public static bvg<btl> a(Predicate<jm<cet>> $$0, ccq<jl> $$1) {
      return bys.a((Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jl $$6 = $$2.b($$2x);
               jd $$7 = $$6.b();
               if ($$3.af() == $$6.a() && $$7.a($$4.do(), 16.0)) {
                  aqt $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     age.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aqt $$0, jd $$1, btl $$2) {
      dta $$3 = $$0.a_($$1);
      return $$3.a(awd.R) && $$3.c(dfp.c) && !$$2.fI();
   }
}
