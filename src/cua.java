import java.util.List;
import javax.annotation.Nullable;

public interface cua {
   void a(blt<?> var1, aup var2);

   static void a(cmr $$0, List<vd> $$1, String $$2) {
      vd $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(vc.a);
         $$1.add(vd.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(vc.a().b(vd.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static vd a(cmr $$0, String $$1) {
      sl $$2 = ckk.a($$0);
      if ($$2 != null) {
         ahd $$3 = a($$2, $$1);
         if ($$3 != null) {
            return kd.g.b($$3).map($$0x -> vd.c($$0x.g()).a(n.h)).orElse(null);
         }
      }

      return null;
   }

   @Nullable
   private static ahd a(sl $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ahd.a($$2);
      } else {
         return null;
      }
   }
}
