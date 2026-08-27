import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class chr {
   public static bss<chk> a() {
      return buu.a(
         (Function<buu.b<chk>, ? extends App<buu.c<chk>, bux<chk>>>)($$0 -> $$0.group($$0.b(bys.ak), $$0.c(bys.ab), $$0.c(bys.ah), $$0.a(bys.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(chr::a)).isPresent()) {
                        che $$6 = $$0.b($$1);
                        chl.c($$4x, $$6);
                        chl.c((chj)$$4x);
                        chl.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(chl::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(chj $$0) {
      return $$0.dP().a(bys.ah);
   }
}
