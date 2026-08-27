import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxj {
   private static final int a = 16;

   public static buh<bso> a(Predicate<ja<cdu>> $$0, cbr<iz> $$1) {
      return bxt.a((Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               iz $$6 = $$2.b($$2x);
               ir $$7 = $$6.b();
               if ($$3.af() == $$6.a() && $$7.a($$4.ds(), 16.0)) {
                  aqt $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     agi.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aqt $$0, ir $$1, bso $$2) {
      dtc $$3 = $$0.a_($$1);
      return $$3.a(awe.R) && $$3.c(deu.c) && !$$2.fU();
   }
}
