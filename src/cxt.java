import java.util.List;
import javax.annotation.Nullable;

public interface cxt {
   void a(bpd<?> var1, axd var2);

   static void a(cqm $$0, List<vu> $$1, String $$2) {
      vu $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(vt.a);
         $$1.add(vu.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(vt.a().b(vu.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static vu a(cqm $$0, String $$1) {
      ta $$2 = coh.a($$0);
      if ($$2 != null) {
         ajh $$3 = a($$2, $$1);
         if ($$3 != null) {
            return ki.g.b($$3).map($$0x -> vu.c($$0x.g()).a(n.h)).orElse(null);
         }
      }

      return null;
   }

   @Nullable
   private static ajh a(ta $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ajh.a($$2);
      } else {
         return null;
      }
   }
}
