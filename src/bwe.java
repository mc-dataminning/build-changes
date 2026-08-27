import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwe {
   public static bsh<bqo> a() {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$0 -> $$0.group($$0.a(bzr.n), $$0.a(bzr.az), $$0.a(bzr.ay), $$0.c(bzr.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ib> $$7 = $$0.<bqo>a($$3).map(bpv::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bsj($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
