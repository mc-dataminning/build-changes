import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cac {
   private static final int a = 16;

   public static bxa<bvg> a(Predicate<jr<cgn>> $$0, cek<jq> $$1) {
      return cam.a((Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jq $$6 = $$2.b($$2x);
               ji $$7 = $$6.b();
               if ($$3.ai() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  ard $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.A().b($$7);
                     agd.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ard $$0, ji $$1, bvg $$2) {
      dww $$3 = $$0.a_($$1);
      return $$3.a(awp.T) && $$3.c(dje.c) && !$$2.fR();
   }
}
