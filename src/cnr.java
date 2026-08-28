import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cnr {
   public static byk<cnk> a() {
      return cam.a(
         (Function<cam.b<cnk>, ? extends App<cam.c<cnk>, cap<cnk>>>)($$0 -> $$0.group($$0.b(cek.ak), $$0.c(cek.ab), $$0.c(cek.ah), $$0.a(cek.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.e_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cnr::a)).isPresent()) {
                        cne $$6 = $$0.b($$1);
                        cnl.c($$3x, $$4x, $$6);
                        cnl.b((cnj)$$4x);
                        cnl.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cnl::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cnj $$0) {
      return $$0.eb().a(cek.ah);
   }
}
