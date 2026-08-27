import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpc {
   private static final int a = 16;

   public static bmb<bkj> a(Predicate<ib<bvl>> $$0, btk<ia> $$1) {
      return bpm.a((Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ia $$6 = $$2.b($$2x);
               ht $$7 = $$6.b();
               if ($$3.ac() == $$6.a() && $$7.a($$4.dj(), 16.0)) {
                  alq $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.w().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.w().b($$7);
                     abz.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(alq $$0, ht $$1, bkj $$2) {
      dgb $$3 = $$0.a_($$1);
      return $$3.a(aqs.R) && $$3.c(ctt.c) && !$$2.fD();
   }
}
