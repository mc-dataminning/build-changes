import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqz {
   private static final int a = 16;

   public static bnx<bmf> a(Predicate<ih<bxj>> $$0, bvh<ig> $$1) {
      return brj.a((Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ig $$6 = $$2.b($$2x);
               hx $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dk(), 16.0)) {
                  amz $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     adf.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(amz $$0, hx $$1, bmf $$2) {
      dja $$3 = $$0.a_($$1);
      return $$3.a(asb.R) && $$3.c(cwc.c) && !$$2.fD();
   }
}
