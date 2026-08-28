import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cco {
   public static byr<bwz> a() {
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$0 -> $$0.group($$0.a(cgb.o), $$0.a(cgb.aA), $$0.a(cgb.az), $$0.c(cgb.p))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iu> $$7 = $$0.<bwz>a($$3).map(bwa::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new byt($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
