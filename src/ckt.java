import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class ckt {
   public static bvs<ckm> a() {
      return bxu.a(
         (Function<bxu.b<ckm>, ? extends App<bxu.c<ckm>, bxx<ckm>>>)($$0 -> $$0.group($$0.b(cbs.ak), $$0.c(cbs.ab), $$0.c(cbs.ah), $$0.a(cbs.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(ckt::a)).isPresent()) {
                        ckg $$6 = $$0.b($$1);
                        ckn.c($$4x, $$6);
                        ckn.c((ckl)$$4x);
                        ckn.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(ckn::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(ckl $$0) {
      return $$0.dS().a(cbs.ah);
   }
}
