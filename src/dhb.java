import java.util.List;
import javax.annotation.Nullable;

public interface dhb {
   void a(buq<?> var1, azg var2);

   static void a(cwn $$0, List<wo> $$1, String $$2) {
      wo $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wn.a);
         $$1.add(wo.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wn.a().b(wo.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wo a(cwn $$0, String $$1) {
      tq $$2 = $$0.a(kv.Y, cyw.a).e();
      aku $$3 = a($$2, $$1);
      return $$3 != null ? mb.f.b($$3).map($$0x -> wo.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static aku a(tq $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return aku.c($$2);
      } else {
         return null;
      }
   }
}
