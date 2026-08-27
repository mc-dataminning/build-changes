import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bpb {
   public static bmq<bky> a(int $$0, BiPredicate<bky, bky> $$1) {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$2 -> $$2.group($$2.b(btz.o), $$2.a(btz.aa), $$2.c(btz.ah), $$2.a(btz.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bky $$10 = $$2.b($$3);
                     if (!$$10.ev()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dl(), (long)$$0);
                        if ($$10.ag() != bkm.bt || $$7.X().b(cro.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
