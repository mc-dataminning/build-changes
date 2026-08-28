import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzr {
   private static final int a = 16;

   public static bwp<buv> a(Predicate<jp<cgc>> $$0, cdz<jo> $$1) {
      return cab.a((Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jo $$6 = $$2.b($$2x);
               jg $$7 = $$6.b();
               if ($$3.ag() == $$6.a() && $$7.a($$4.dv(), 16.0)) {
                  arm $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     agr.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arm $$0, jg $$1, buv $$2) {
      dvd $$3 = $$0.a_($$1);
      return $$3.a(awz.S) && $$3.c(dhr.c) && !$$2.fT();
   }
}
