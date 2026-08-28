import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byz {
   public static bwy<bve> a(bup<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$2x -> $$2x.group($$2x.a(cei.n), $$2x.c(cei.q), $$2x.b(cei.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bve> $$9 = $$2x.<cek>b($$5).a($$3xx -> $$3xx.g((bui)$$7) <= (double)$$2 && $$0.equals($$3xx.ar()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bve $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bxi($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
