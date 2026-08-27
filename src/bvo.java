import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvo {
   private static final int a = 16;

   public static bsm<bqt> a(Predicate<in<cbz>> $$0, bzw<im> $$1) {
      return bvy.a((Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               im $$6 = $$2.b($$2x);
               id $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dk(), 16.0)) {
                  apu $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     afk.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(apu $$0, id $$1, bqt $$2) {
      dpi $$3 = $$0.a_($$1);
      return $$3.a(ave.R) && $$3.c(dca.c) && !$$2.fI();
   }
}
