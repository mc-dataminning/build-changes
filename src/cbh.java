import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbh {
   public static bzo<crl> a() {
      return cda.a((Function<cda.b<crl>, ? extends App<cda.c<crl>, cdd<crl>>>)($$0 -> $$0.group($$0.c(cgy.c)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               crm $$3 = $$1.gC();
               boolean $$4 = !$$3.b().a(cro.b) && !$$3.b().a(cro.m);
               if ($$4 && $$1.t() == 0 && $$3.c() <= 1) {
                  $$1.a($$1.gC().b($$0xx.J_(), cro.b));
                  $$1.g($$0xx);
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
