import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class clh {
   public static bwf<cla> a() {
      return byh.a(
         (Function<byh.b<cla>, ? extends App<byh.c<cla>, byk<cla>>>)($$0 -> $$0.group($$0.b(ccf.ak), $$0.c(ccf.ab), $$0.c(ccf.ah), $$0.a(ccf.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(clh::a)).isPresent()) {
                        cku $$6 = $$0.b($$1);
                        clb.c($$4x, $$6);
                        clb.c((ckz)$$4x);
                        clb.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(clb::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(ckz $$0) {
      return $$0.dU().a(ccf.ah);
   }
}
