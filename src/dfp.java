import java.util.List;
import javax.annotation.Nullable;

public interface dfp {
   void a(bug<?> var1, azr var2);

   static void a(cvx $$0, List<xh> $$1, String $$2) {
      xh $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xg.a);
         $$1.add(xh.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xg.a().b(xh.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xh a(cvx $$0, String $$1) {
      uj $$2 = $$0.a(kt.X, cyg.a).d();
      alh $$3 = a($$2, $$1);
      return $$3 != null ? lx.f.b($$3).map($$0x -> xh.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static alh a(uj $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return alh.c($$2);
      } else {
         return null;
      }
   }
}
