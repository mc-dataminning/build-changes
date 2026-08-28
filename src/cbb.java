import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbb {
   private static final int a = 16;

   public static bxz<bwf> a(Predicate<jq<chm>> $$0, cfj<jp> $$1) {
      return cbl.a((Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jp $$6 = $$2.b($$2x);
               jh $$7 = $$6.b();
               if ($$3.ah() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  ash $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.z().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.z().b($$7);
                     ahj.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ash $$0, jh $$1, bwf $$2) {
      dxu $$3 = $$0.a_($$1);
      return $$3.a(axu.T) && $$3.c(dke.c) && !$$2.fP();
   }
}
