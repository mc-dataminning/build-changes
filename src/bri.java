import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bri {
   private static final int a = 16;

   public static bog<bmo> a(Predicate<ih<bxt>> $$0, bvq<ig> $$1) {
      return brs.a((Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ig $$6 = $$2.b($$2x);
               hx $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dj(), 16.0)) {
                  ane $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     adj.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ane $$0, hx $$1, bmo $$2) {
      djp $$3 = $$0.a_($$1);
      return $$3.a(asi.R) && $$3.c(cwr.c) && !$$2.fD();
   }
}
