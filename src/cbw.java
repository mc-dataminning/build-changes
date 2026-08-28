import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbw {
   private static final int a = 16;

   public static byu<bxc> a(Predicate<je<cih>> $$0, cge<jd> $$1) {
      return ccg.a((Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jd $$6 = $$2.b($$2x);
               iu $$7 = $$6.b();
               if ($$3.aj() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
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

   private static boolean a(arq $$0, iu $$1, bxc $$2) {
      dzz $$3 = $$0.a_($$1);
      return $$3.a(axc.T) && $$3.c(dlt.c) && !$$2.fQ();
   }

   private static boolean a(arq $$0, iu $$1) {
      List<cqk> $$2 = $$0.a(cqk.class, new fed($$1), bxc::fQ);
      return !$$2.isEmpty();
   }
}
