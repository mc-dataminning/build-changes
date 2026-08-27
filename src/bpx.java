import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpx {
   public static brl<bnl> a(blh $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static brl<bnl> a(blh $$0, Function<boi, Float> $$1) {
      return btn.a(
         (Function<btn.b<bnl>, ? extends App<btn.c<bnl>, btq<bnl>>>)($$2 -> $$2.group($$2.b(bxl.K), $$2.a(bxl.n), $$2.c(bxl.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bnl $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bxo $$10 = new bxo(new bql($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bql($$9, true));
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
