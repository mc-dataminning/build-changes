import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bnj {
   public static bky<bjg> a(int $$0, BiPredicate<bjg, bjg> $$1) {
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$2 -> $$2.group($$2.b(bsh.o), $$2.a(bsh.aa), $$2.c(bsh.ah), $$2.a(bsh.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bjg $$10 = $$2.b($$3);
                     if (!$$10.ev()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dl(), (long)$$0);
                        if ($$10.ah() != biu.bt || $$7.X().b(cpr.J)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
