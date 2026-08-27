import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvj {
   private static final int a = 16;

   public static bsh<bqo> a(Predicate<il<cbu>> $$0, bzr<ik> $$1) {
      return bvt.a((Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ik $$6 = $$2.b($$2x);
               ib $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dk(), 16.0)) {
                  aps $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     afi.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aps $$0, ib $$1, bqo $$2) {
      doz $$3 = $$0.a_($$1);
      return $$3.a(avc.R) && $$3.c(dbr.c) && !$$2.fI();
   }
}
