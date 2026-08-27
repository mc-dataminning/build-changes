import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvz {
   private static final int a = 16;

   public static bsx<bre> a(Predicate<iv<cck>> $$0, cah<iu> $$1) {
      return bwj.a((Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               iu $$6 = $$2.b($$2x);
               im $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dl(), 16.0)) {
                  aqe $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     afu.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aqe $$0, im $$1, bre $$2) {
      dpy $$3 = $$0.a_($$1);
      return $$3.a(avo.R) && $$3.c(dco.c) && !$$2.fJ();
   }
}
