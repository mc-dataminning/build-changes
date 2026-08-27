import java.util.List;
import javax.annotation.Nullable;

public interface ctq {
   void a(blj<?> var1, auf var2);

   static void a(cmh $$0, List<vb> $$1, String $$2) {
      vb $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(va.a);
         $$1.add(vb.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(va.a().b(vb.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static vb a(cmh $$0, String $$1) {
      sj $$2 = cka.a($$0);
      if ($$2 != null) {
         agt $$3 = a($$2, $$1);
         if ($$3 != null) {
            return kb.g.b($$3).map($$0x -> vb.c($$0x.g()).a(n.h)).orElse(null);
         }
      }

      return null;
   }

   @Nullable
   private static agt a(sj $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return agt.a($$2);
      } else {
         return null;
      }
   }
}
