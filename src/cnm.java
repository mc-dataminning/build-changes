import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cnm {
   public static byi<cnf> a() {
      return cak.a(
         (Function<cak.b<cnf>, ? extends App<cak.c<cnf>, can<cnf>>>)($$0 -> $$0.group($$0.b(cei.ak), $$0.c(cei.ab), $$0.c(cei.ah), $$0.a(cei.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cnm::a)).isPresent()) {
                        cmz $$6 = $$0.b($$1);
                        cng.c($$4x, $$6);
                        cng.c((cne)$$4x);
                        cng.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cng::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cne $$0) {
      return $$0.ee().a(cei.ah);
   }
}
