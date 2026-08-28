import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cay {
   public static bxb<bvh> a() {
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$0 -> $$0.group($$0.a(cel.n), $$0.a(cel.az), $$0.a(cel.ay), $$0.c(cel.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ji> $$7 = $$0.<bvh>a($$3).map(bul::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bxd($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
