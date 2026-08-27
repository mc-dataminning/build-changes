import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bon {
   public static bkr<biy> a() {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$0 -> $$0.group($$0.a(bsa.n), $$0.a(bsa.ay), $$0.a(bsa.ax), $$0.c(bsa.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<gu> $$7 = $$0.<biy>a($$3).map(bii::dk).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bkt($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
