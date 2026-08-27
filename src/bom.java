import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bom {
   public static bkq<biy> a() {
      return bob.a(
         (Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$0 -> $$0.group($$0.a(brz.n), $$0.a(brz.ay), $$0.a(brz.ax), $$0.c(brz.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<gu> $$7 = $$0.<biy>a($$3).map(bii::dk).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bks($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
