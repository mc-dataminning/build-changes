import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cag {
   public static bzk<bwg> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bzk<bwg> a(Predicate<bwg> $$0, Function<bwg, Float> $$1, int $$2) {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$3 -> $$3.group($$3.c(cfk.m), $$3.b(cfk.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cfn($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
