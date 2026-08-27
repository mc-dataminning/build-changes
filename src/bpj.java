import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bpj {
   public static bmy<blg> a(int $$0, BiPredicate<blg, blg> $$1) {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$2 -> $$2.group($$2.b(buh.o), $$2.a(buh.aa), $$2.c(buh.ah), $$2.a(buh.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     blg $$10 = $$2.b($$3);
                     if (!$$10.ex()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dn(), (long)$$0);
                        if ($$10.ai() != bku.bt || $$7.Y().b(crw.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
