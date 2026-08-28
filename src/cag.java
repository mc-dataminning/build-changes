import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cag {
   public static bxr<bvx> a() {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$0 -> $$0.group($$0.b(cfb.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bvx $$1xx ? $$1xx : null)
                           .filter(bvx::eF)
                           .filter($$1xx -> $$1xx.aq() != bvi.bS || $$2.O().b(dgv.O))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
