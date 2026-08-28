import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzi {
   private static final int a = 16;

   public static bwg<bun> a(Predicate<jo<cft>> $$0, cdq<jn> $$1) {
      return bzs.a((Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jn $$6 = $$2.b($$2x);
               jf $$7 = $$6.b();
               if ($$3.ag() == $$6.a() && $$7.a($$4.dq(), 16.0)) {
                  arj $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     ago.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arj $$0, jf $$1, bun $$2) {
      dus $$3 = $$0.a_($$1);
      return $$3.a(awv.S) && $$3.c(dhf.c) && !$$2.fN();
   }
}
