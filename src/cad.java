import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cad {
   private static final int a = 16;

   public static bxb<bvh> a(Predicate<jq<cgo>> $$0, cel<jp> $$1) {
      return can.a((Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jp $$6 = $$2.b($$2x);
               jh $$7 = $$6.b();
               if ($$3.ag() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  arp $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.z().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.z().b($$7);
                     agt.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arp $$0, jh $$1, bvh $$2) {
      dvv $$3 = $$0.a_($$1);
      return $$3.a(axc.S) && $$3.c(dij.c) && !$$2.fP();
   }
}
