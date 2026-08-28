import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cat {
   private static final int a = 16;

   public static bxr<bvx> a(Predicate<jq<che>> $$0, cfb<jp> $$1) {
      return cbd.a((Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jp $$6 = $$2.b($$2x);
               jh $$7 = $$6.b();
               if ($$3.ai() == $$6.a() && $$7.a($$4.du(), 16.0)) {
                  arx $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.A().b($$7);
                     agy.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arx $$0, jh $$1, bvx $$2) {
      dxo $$3 = $$0.a_($$1);
      return $$3.a(axk.T) && $$3.c(djw.c) && !$$2.fR();
   }
}
