import java.util.List;
import javax.annotation.Nullable;

public interface cup {
   void a(bmc<?> var1, auw var2);

   static void a(cng $$0, List<vg> $$1, String $$2) {
      vg $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(vf.a);
         $$1.add(vg.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(vf.a().b(vg.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static vg a(cng $$0, String $$1) {
      so $$2 = cla.a($$0);
      if ($$2 != null) {
         ahh $$3 = a($$2, $$1);
         if ($$3 != null) {
            return kd.g.b($$3).map($$0x -> vg.c($$0x.g()).a(n.h)).orElse(null);
         }
      }

      return null;
   }

   @Nullable
   private static ahh a(so $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ahh.a($$2);
      } else {
         return null;
      }
   }
}
