import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byl {
   private static final int a = 16;

   public static bvj<btp> a(Predicate<ji<cew>> $$0, cct<jh> $$1) {
      return byv.a((Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jh $$6 = $$2.b($$2x);
               iz $$7 = $$6.b();
               if ($$3.af() == $$6.a() && $$7.a($$4.dn(), 16.0)) {
                  arf $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     agt.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arf $$0, iz $$1, btp $$2) {
      dsc $$3 = $$0.a_($$1);
      return $$3.a(awp.R) && $$3.c(des.c) && !$$2.fL();
   }
}
