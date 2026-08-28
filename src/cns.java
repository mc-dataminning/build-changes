import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cns {
   public static byk<cnl> a() {
      return cam.a(
         (Function<cam.b<cnl>, ? extends App<cam.c<cnl>, cap<cnl>>>)($$0 -> $$0.group($$0.b(cek.ak), $$0.c(cek.ab), $$0.c(cek.ah), $$0.a(cek.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.e_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cns::a)).isPresent()) {
                        cnf $$6 = $$0.b($$1);
                        cnm.c($$3x, $$4x, $$6);
                        cnm.b((cnk)$$4x);
                        cnm.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cnm::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cnk $$0) {
      return $$0.ec().a(cek.ah);
   }
}
