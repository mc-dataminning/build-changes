import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzf {
   private static final int a = 16;

   public static bwd<buk> a(Predicate<jn<cfq>> $$0, cdn<jm> $$1) {
      return bzp.a((Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jm $$6 = $$2.b($$2x);
               je $$7 = $$6.b();
               if ($$3.ag() == $$6.a() && $$7.a($$4.dq(), 16.0)) {
                  arh $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     agn.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arh $$0, je $$1, buk $$2) {
      duo $$3 = $$0.a_($$1);
      return $$3.a(awt.S) && $$3.c(dhc.c) && !$$2.fM();
   }
}
