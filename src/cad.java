import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class cad {
   private static final int a = 16;

   public static bxb<bvh> a(Predicate<jr<cgo>> $$0, cel<jq> $$1) {
      return can.a((Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jq $$6 = $$2.b($$2x);
               ji $$7 = $$6.b();
               if ($$3.ai() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  ard $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     if (!a($$8, $$7)) {
                        $$3.A().b($$7);
                        agd.c($$3, $$7);
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ard $$0, ji $$1, bvh $$2) {
      dwx $$3 = $$0.a_($$1);
      return $$3.a(awp.T) && $$3.c(djf.c) && !$$2.fR();
   }

   private static boolean a(ard $$0, ji $$1) {
      List<coi> $$2 = $$0.a(coi.class, new fav($$1), bvh::fR);
      return !$$2.isEmpty();
   }
}
