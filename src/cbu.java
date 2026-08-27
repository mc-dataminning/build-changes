import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cbu {
   public static bnk<cbn> a() {
      return bpm.a(
         (Function<bpm.b<cbn>, ? extends App<bpm.c<cbn>, bpp<cbn>>>)($$0 -> $$0.group($$0.b(btk.aj), $$0.c(btk.aa), $$0.c(btk.ag), $$0.a(btk.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cbu::a)).isPresent()) {
                        cbh $$6 = $$0.b($$1);
                        cbo.c($$4x, $$6);
                        cbo.c((cbm)$$4x);
                        cbo.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cbo::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cbm $$0) {
      return $$0.dN().a(btk.ag);
   }
}
