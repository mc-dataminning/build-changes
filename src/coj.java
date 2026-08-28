import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class coj {
   public static bzb<coc> a() {
      return cbd.a(
         (Function<cbd.b<coc>, ? extends App<cbd.c<coc>, cbg<coc>>>)($$0 -> $$0.group($$0.b(cfb.ak), $$0.c(cfb.ab), $$0.c(cfb.ah), $$0.a(cfb.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.e_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(coj::a)).isPresent()) {
                        cnw $$6 = $$0.b($$1);
                        cod.c($$3x, $$4x, $$6);
                        cod.b((cob)$$4x);
                        cod.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cod::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cob $$0) {
      return $$0.ec().a(cfb.ah);
   }
}
