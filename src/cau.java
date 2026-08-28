import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class cau {
   private static final int a = 16;

   public static bxs<bvy> a(Predicate<jr<chf>> $$0, cfc<jq> $$1) {
      return cbe.a((Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jq $$6 = $$2.b($$2x);
               ji $$7 = $$6.b();
               if ($$3.aj() == $$6.a() && $$7.a($$4.ds(), 16.0)) {
                  ard $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     if (!a($$8, $$7)) {
                        $$3.A().b($$7);
                        agc.c($$3, $$7);
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ard $$0, ji $$1, bvy $$2) {
      dxq $$3 = $$0.a_($$1);
      return $$3.a(awp.T) && $$3.c(djx.c) && !$$2.fT();
   }

   private static boolean a(ard $$0, ji $$1) {
      List<cpd> $$2 = $$0.a(cpd.class, new fbs($$1), bvy::fT);
      return !$$2.isEmpty();
   }
}
