import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqe {
   private static final int a = 16;

   public static bnd<bll> a(Predicate<ig<bwn>> $$0, bum<ie> $$1) {
      return bqo.a((Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ie $$6 = $$2.b($$2x);
               hx $$7 = $$6.b();
               if ($$3.ad() == $$6.a() && $$7.a($$4.dl(), 16.0)) {
                  ami $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.x().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.x().b($$7);
                     aco.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ami $$0, hx $$1, bll $$2) {
      dhn $$3 = $$0.a_($$1);
      return $$3.a(ark.R) && $$3.c(cuy.c) && !$$2.fE();
   }
}
