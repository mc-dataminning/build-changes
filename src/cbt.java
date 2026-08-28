import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbt {
   private static final int a = 16;

   public static byr<bwz> a(Predicate<je<cie>> $$0, cgb<jd> $$1) {
      return ccd.a((Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jd $$6 = $$2.b($$2x);
               iu $$7 = $$6.b();
               if ($$3.aj() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  aro $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     if (!a($$8, $$7)) {
                        $$3.A().b($$7);
                        agk.c($$3, $$7);
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aro $$0, iu $$1, bwz $$2) {
      dzo $$3 = $$0.a_($$1);
      return $$3.a(axa.T) && $$3.c(dln.c) && !$$2.fQ();
   }

   private static boolean a(aro $$0, iu $$1) {
      List<cqe> $$2 = $$0.a(cqe.class, new fdr($$1), bwz::fQ);
      return !$$2.isEmpty();
   }
}
