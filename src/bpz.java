import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpz {
   private static final int a = 16;

   public static bmy<blg> a(Predicate<ib<bwi>> $$0, buh<ia> $$1) {
      return bqj.a((Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ia $$6 = $$2.b($$2x);
               ht $$7 = $$6.b();
               if ($$3.ad() == $$6.a() && $$7.a($$4.dl(), 16.0)) {
                  ame $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.x().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.x().b($$7);
                     ack.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ame $$0, ht $$1, blg $$2) {
      dhi $$3 = $$0.a_($$1);
      return $$3.a(arg.R) && $$3.c(cut.c) && !$$2.fE();
   }
}
