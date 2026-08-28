import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cpo {
   public static cab<cph> a() {
      return ccd.a(
         (Function<ccd.b<cph>, ? extends App<ccd.c<cph>, ccg<cph>>>)($$0 -> $$0.group($$0.b(cgb.al), $$0.c(cgb.ac), $$0.c(cgb.ai), $$0.a(cgb.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cpo::a)).isPresent()) {
                        cpb $$6 = $$0.b($$1);
                        cpi.c($$3x, $$4x, $$6);
                        cpi.b((cpg)$$4x);
                        cpi.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cpi::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cpg $$0) {
      return $$0.eb().a(cgb.ai);
   }
}
