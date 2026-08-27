import java.util.List;
import javax.annotation.Nullable;

public interface cww {
   void a(bol<?> var1, awt var2);

   static void a(cpq $$0, List<vs> $$1, String $$2) {
      vs $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(vr.a);
         $$1.add(vs.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(vr.a().b(vs.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static vs a(cpq $$0, String $$1) {
      sy $$2 = cnl.a($$0);
      if ($$2 != null) {
         ajc $$3 = a($$2, $$1);
         if ($$3 != null) {
            return kh.g.b($$3).map($$0x -> vs.c($$0x.g()).a(n.h)).orElse(null);
         }
      }

      return null;
   }

   @Nullable
   private static ajc a(sy $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ajc.a($$2);
      } else {
         return null;
      }
   }
}
