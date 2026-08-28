import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bza {
   private static final int a = 16;

   public static bvy<buf> a(Predicate<jn<cfl>> $$0, cdi<jm> $$1) {
      return bzk.a((Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jm $$6 = $$2.b($$2x);
               je $$7 = $$6.b();
               if ($$3.ag() == $$6.a() && $$7.a($$4.dq(), 16.0)) {
                  arg $$8 = $$3.o().a($$6.a());
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

   private static boolean a(arg $$0, je $$1, buf $$2) {
      dua $$3 = $$0.a_($$1);
      return $$3.a(aws.S) && $$3.c(dgo.c) && !$$2.fL();
   }
}
