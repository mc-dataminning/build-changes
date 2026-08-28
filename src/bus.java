import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bus {
   public static bwf<btd> a(int $$0, float $$1) {
      return byh.a(
         (Function<byh.b<btd>, ? extends App<byh.c<btd>, byk<btd>>>)($$2 -> $$2.group($$2.c(ccf.m), $$2.a(ccf.n), $$2.b(ccf.o), $$2.b(ccf.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     btb $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cch>b($$6).a($$9)) {
                        $$4.a(new bvf($$9, true));
                        $$7.H().a(-$$1, 0.0F);
                        $$7.s(ayg.c($$7.dG(), $$7.ba, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
