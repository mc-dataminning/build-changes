import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cou<E extends col> {
   public static bya<bwg> a(int $$0) {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$1 -> $$1.group($$1.b(cfk.ad), $$1.a(cfk.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fa().f()) {
                        return false;
                     } else {
                        Optional<cmb> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
