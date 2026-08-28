import java.util.List;
import javax.annotation.Nullable;

public interface dhd {
   void a(bus<?> var1, azh var2);

   static void a(cwp $$0, List<wp> $$1, String $$2) {
      wp $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wo.a);
         $$1.add(wp.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wo.a().b(wp.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wp a(cwp $$0, String $$1) {
      tq $$2 = $$0.a(kv.Y, cyy.a).e();
      akv $$3 = a($$2, $$1);
      return $$3 != null ? mb.f.b($$3).map($$0x -> wp.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static akv a(tq $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return akv.c($$2);
      } else {
         return null;
      }
   }
}
