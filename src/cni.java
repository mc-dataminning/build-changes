import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cni {
   public static bye<cnb> a() {
      return cag.a(
         (Function<cag.b<cnb>, ? extends App<cag.c<cnb>, caj<cnb>>>)($$0 -> $$0.group($$0.b(cee.ak), $$0.c(cee.ab), $$0.c(cee.ah), $$0.a(cee.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cni::a)).isPresent()) {
                        cmv $$6 = $$0.b($$1);
                        cnc.c($$4x, $$6);
                        cnc.c((cna)$$4x);
                        cnc.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cnc::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cna $$0) {
      return $$0.ed().a(cee.ah);
   }
}
