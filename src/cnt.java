import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cnt {
   public static bym<cnm> a() {
      return cao.a(
         (Function<cao.b<cnm>, ? extends App<cao.c<cnm>, car<cnm>>>)($$0 -> $$0.group($$0.b(cem.ak), $$0.c(cem.ab), $$0.c(cem.ah), $$0.a(cem.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.e_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cnt::a)).isPresent()) {
                        cng $$6 = $$0.b($$1);
                        cnn.c($$3x, $$4x, $$6);
                        cnn.b((cnl)$$4x);
                        cnn.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cnn::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cnl $$0) {
      return $$0.eb().a(cem.ah);
   }
}
