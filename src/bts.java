import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bts {
   private static final int a = 16;

   public static bqq<box> a(Predicate<il<cad>> $$0, bya<ik> $$1) {
      return buc.a((Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ik $$6 = $$2.b($$2x);
               ib $$7 = $$6.b();
               if ($$3.ad() == $$6.a() && $$7.a($$4.dh(), 16.0)) {
                  apa $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     aes.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(apa $$0, ib $$1, box $$2) {
      dme $$3 = $$0.a_($$1);
      return $$3.a(aue.R) && $$3.c(cyy.c) && !$$2.fF();
   }
}
