import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxk {
   private static final int a = 16;

   public static bui<bso> a(Predicate<ix<cdv>> $$0, cbs<iw> $$1) {
      return bxu.a((Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               iw $$6 = $$2.b($$2x);
               io $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dn(), 16.0)) {
                  aqm $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     aga.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aqm $$0, io $$1, bso $$2) {
      drb $$3 = $$0.a_($$1);
      return $$3.a(avw.R) && $$3.c(ddr.c) && !$$2.fL();
   }
}
