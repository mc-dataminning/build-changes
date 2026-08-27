import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class btu {
   public static bpx<bog> a() {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$0 -> $$0.group($$0.a(bxh.n), $$0.a(bxh.az), $$0.a(bxh.ay), $$0.c(bxh.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<hz> $$7 = $$0.<bog>a($$3).map(bno::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bpz($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
