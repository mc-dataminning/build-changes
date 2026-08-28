import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cos {
   public static bzj<cok> a() {
      return cbl.a(
         (Function<cbl.b<cok>, ? extends App<cbl.c<cok>, cbo<cok>>>)($$0 -> $$0.group($$0.b(cfj.ak), $$0.c(cfj.ab), $$0.c(cfj.ah), $$0.a(cfj.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.e_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cos::a)).isPresent()) {
                        coe $$6 = $$0.b($$1);
                        col.c($$3x, $$4x, $$6);
                        col.b((coj)$$4x);
                        col.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(col::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(coj $$0) {
      return $$0.ec().a(cfj.ah);
   }
}
