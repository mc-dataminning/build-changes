import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxm {
   private static final int a = 16;

   public static buk<bsq> a(Predicate<ix<cdx>> $$0, cbu<iw> $$1) {
      return bxw.a((Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               iw $$6 = $$2.b($$2x);
               io $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dn(), 16.0)) {
                  aqn $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     agb.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aqn $$0, io $$1, bsq $$2) {
      drd $$3 = $$0.a_($$1);
      return $$3.a(avx.R) && $$3.c(ddt.c) && !$$2.fL();
   }
}
