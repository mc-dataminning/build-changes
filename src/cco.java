import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class cco {
   private static final int a = 16;

   public static bzm<bxu> a(Predicate<jf<ciz>> $$0, cgw<je> $$1) {
      return ccy.a((Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               je $$6 = $$2.b($$2x);
               iv $$7 = $$6.b();
               if ($$3.aj() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  ars $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     if (!a($$8, $$7)) {
                        $$3.A().b($$7);
                        ago.c($$3, $$7);
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ars $$0, iv $$1, bxu $$2) {
      ebe $$3 = $$0.a_($$1);
      return $$3.a(axe.T) && $$3.c(dmv.c) && !$$2.fR();
   }

   private static boolean a(ars $$0, iv $$1) {
      List<crj> $$2 = $$0.a(crj.class, new ffl($$1), bxu::fR);
      return !$$2.isEmpty();
   }
}
