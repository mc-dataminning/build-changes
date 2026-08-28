import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxj {
   public static bxn<bum> a(int $$0) {
      return bzp.a(
         (Function<bzp.b<bum>, ? extends App<bzp.c<bum>, bzs<bum>>>)($$1 -> $$1.group($$1.a(cdn.n), $$1.b(cdn.o), $$1.c(cdn.p), $$1.b(cdn.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     buk $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cdp>b($$5).a($$9)) {
                        $$2.a(new bwn($$9, true));
                        $$7.a(bro.a);
                        $$7.E($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bum $$0) {
      return $$0.b($$1 -> {
         cvk $$2 = $$1.h();
         return $$2 instanceof cwl && $$0.a((cwl)$$2);
      });
   }
}
