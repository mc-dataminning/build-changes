import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bof {
   private static final int a = 16;

   public static ble<bjm> a(Predicate<he<buo>> $$0, bsn<hd> $$1) {
      return bop.a((Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               hd $$6 = $$2.b($$2x);
               gw $$7 = $$6.b();
               if ($$3.ac() == $$6.a() && $$7.a($$4.dj(), 16.0)) {
                  akt $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.w().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.w().b($$7);
                     abc.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(akt $$0, gw $$1, bjm $$2) {
      dfd $$3 = $$0.a_($$1);
      return $$3.a(apv.R) && $$3.c(csv.c) && !$$2.fD();
   }
}
