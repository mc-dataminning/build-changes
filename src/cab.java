import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cab {
   private static final int a = 16;

   public static bwz<bvf> a(Predicate<jr<cgm>> $$0, cej<jq> $$1) {
      return cal.a((Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jq $$6 = $$2.b($$2x);
               ji $$7 = $$6.b();
               if ($$3.ai() == $$6.a() && $$7.a($$4.du(), 16.0)) {
                  arc $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.A().b($$7);
                     agc.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arc $$0, ji $$1, bvf $$2) {
      dwv $$3 = $$0.a_($$1);
      return $$3.a(awo.T) && $$3.c(djd.c) && !$$2.fR();
   }
}
