import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpx {
   public static bmb<bkj> a() {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$0 -> $$0.group($$0.a(btk.n), $$0.a(btk.ay), $$0.a(btk.ax), $$0.c(btk.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ht> $$7 = $$0.<bkj>a($$3).map(bjt::dl).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bmd($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
