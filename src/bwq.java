import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwq {
   public static bye<btv> a(bro $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bye<btv> a(bro $$0, Function<bva, Float> $$1) {
      return cag.a(
         (Function<cag.b<btv>, ? extends App<cag.c<btv>, caj<btv>>>)($$2 -> $$2.group($$2.b(cee.K), $$2.a(cee.n), $$2.c(cee.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        btv $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ceh $$10 = new ceh(new bxe($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bxe($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
