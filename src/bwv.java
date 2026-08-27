import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwv {
   private static final int a = 16;

   public static btt<bsa> a(Predicate<iw<cdg>> $$0, cbd<iv> $$1) {
      return bxf.a((Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               iv $$6 = $$2.b($$2x);
               in $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dl(), 16.0)) {
                  aqh $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     afw.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aqh $$0, in $$1, bsa $$2) {
      dqh $$3 = $$0.a_($$1);
      return $$3.a(avr.R) && $$3.c(dcx.c) && !$$2.fJ();
   }
}
