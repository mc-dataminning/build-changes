import java.util.List;
import javax.annotation.Nullable;

public interface cug {
   void a(bly<?> var1, auu var2);

   static void a(cmx $$0, List<vf> $$1, String $$2) {
      vf $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(ve.a);
         $$1.add(vf.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(ve.a().b(vf.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static vf a(cmx $$0, String $$1) {
      sn $$2 = ckq.a($$0);
      if ($$2 != null) {
         ahg $$3 = a($$2, $$1);
         if ($$3 != null) {
            return kd.g.b($$3).map($$0x -> vf.c($$0x.g()).a(n.h)).orElse(null);
         }
      }

      return null;
   }

   @Nullable
   private static ahg a(sn $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ahg.a($$2);
      } else {
         return null;
      }
   }
}
