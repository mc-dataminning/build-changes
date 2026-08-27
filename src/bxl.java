import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class bxl {
   public static bjb<bxe> a() {
      return bld.a(
         (Function<bld.b<bxe>, ? extends App<bld.c<bxe>, blg<bxe>>>)($$0 -> $$0.group($$0.b(bpb.aj), $$0.c(bpb.aa), $$0.c(bpb.ag), $$0.a(bpb.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.h_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(bxl::a)).isPresent()) {
                        bwy $$6 = $$0.b($$1);
                        bxf.c($$4x, $$6);
                        bxf.c((bxd)$$4x);
                        bxf.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(bxf::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bxd $$0) {
      return $$0.dK().a(bpb.ag);
   }
}
