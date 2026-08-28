import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byn {
   private static final int a = 16;

   public static bvl<btr> a(Predicate<ji<cey>> $$0, ccv<jh> $$1) {
      return byx.a((Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jh $$6 = $$2.b($$2x);
               iz $$7 = $$6.b();
               if ($$3.af() == $$6.a() && $$7.a($$4.dn(), 16.0)) {
                  arf $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     agt.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arf $$0, iz $$1, btr $$2) {
      dse $$3 = $$0.a_($$1);
      return $$3.a(awp.R) && $$3.c(deu.c) && !$$2.fL();
   }
}
