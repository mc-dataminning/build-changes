import java.util.List;
import javax.annotation.Nullable;

public interface dgh {
   void a(bus<?> var1, azu var2);

   static void a(cwm $$0, List<xj> $$1, String $$2) {
      xj $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xi.a);
         $$1.add(xj.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xi.a().b(xj.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xj a(cwm $$0, String $$1) {
      ul $$2 = $$0.a(ku.Y, cyv.a).d();
      alj $$3 = a($$2, $$1);
      return $$3 != null ? lz.f.b($$3).map($$0x -> xj.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static alj a(ul $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return alj.c($$2);
      } else {
         return null;
      }
   }
}
