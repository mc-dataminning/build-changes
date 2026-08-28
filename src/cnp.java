import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cnp {
   public static byl<cni> a() {
      return can.a(
         (Function<can.b<cni>, ? extends App<can.c<cni>, caq<cni>>>)($$0 -> $$0.group($$0.b(cel.ak), $$0.c(cel.ab), $$0.c(cel.ah), $$0.a(cel.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.e_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cnp::a)).isPresent()) {
                        cnc $$6 = $$0.b($$1);
                        cnj.c($$3x, $$4x, $$6);
                        cnj.b((cnh)$$4x);
                        cnj.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cnj::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cnh $$0) {
      return $$0.eb().a(cel.ah);
   }
}
