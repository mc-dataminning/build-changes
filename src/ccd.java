import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ccd {
   private static final int a = 16;

   public static bzb<bxj> a(Predicate<jf<cio>> $$0, cgl<je> $$1) {
      return ccn.a((Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               je $$6 = $$2.b($$2x);
               iv $$7 = $$6.b();
               if ($$3.aj() == $$6.a() && $$7.a($$4.ds(), 16.0)) {
                  arq $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     if (!a($$8, $$7)) {
                        $$3.A().b($$7);
                        agm.c($$3, $$7);
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arq $$0, iv $$1, bxj $$2) {
      eat $$3 = $$0.a_($$1);
      return $$3.a(axc.T) && $$3.c(dmk.c) && !$$2.fQ();
   }

   private static boolean a(arq $$0, iv $$1) {
      List<cqy> $$2 = $$0.a(cqy.class, new fex($$1), bxj::fQ);
      return !$$2.isEmpty();
   }
}
