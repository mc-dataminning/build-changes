import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cgi {
   public static brl<cgb> a() {
      return btn.a(
         (Function<btn.b<cgb>, ? extends App<btn.c<cgb>, btq<cgb>>>)($$0 -> $$0.group($$0.b(bxl.ak), $$0.c(bxl.ab), $$0.c(bxl.ah), $$0.a(bxl.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cgi::a)).isPresent()) {
                        cfv $$6 = $$0.b($$1);
                        cgc.c($$4x, $$6);
                        cgc.c((cga)$$4x);
                        cgc.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cgc::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cga $$0) {
      return $$0.dO().a(bxl.ah);
   }
}
