import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bun {
   public static bqq<box> a() {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$0 -> $$0.group($$0.a(bya.n), $$0.a(bya.az), $$0.a(bya.ay), $$0.c(bya.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ib> $$7 = $$0.<box>a($$3).map(bof::dj).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bqs($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
