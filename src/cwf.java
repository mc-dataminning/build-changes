import java.util.List;
import javax.annotation.Nullable;

public interface cwf {
   void a(bnu<?> var1, awo var2);

   static void a(coz $$0, List<vq> $$1, String $$2) {
      vq $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(vp.a);
         $$1.add(vq.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(vp.a().b(vq.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static vq a(coz $$0, String $$1) {
      sw $$2 = cms.a($$0);
      if ($$2 != null) {
         aiy $$3 = a($$2, $$1);
         if ($$3 != null) {
            return kf.g.b($$3).map($$0x -> vq.c($$0x.g()).a(n.h)).orElse(null);
         }
      }

      return null;
   }

   @Nullable
   private static aiy a(sw $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return aiy.a($$2);
      } else {
         return null;
      }
   }
}
