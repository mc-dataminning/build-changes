import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpr {
   private static final int a = 16;

   public static bmq<bky> a(Predicate<ib<bwa>> $$0, btz<ia> $$1) {
      return bqb.a((Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ia $$6 = $$2.b($$2x);
               ht $$7 = $$6.b();
               if ($$3.ac() == $$6.a() && $$7.a($$4.dj(), 16.0)) {
                  ama $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.w().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.w().b($$7);
                     aci.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ama $$0, ht $$1, bky $$2) {
      dgw $$3 = $$0.a_($$1);
      return $$3.a(arc.R) && $$3.c(cum.c) && !$$2.fD();
   }
}
