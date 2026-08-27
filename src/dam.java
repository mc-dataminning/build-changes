import java.util.List;
import javax.annotation.Nullable;

public interface dam {
   void a(bqr<?> var1, ayd var2);

   static void a(csd $$0, List<ws> $$1, String $$2) {
      ws $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wr.a);
         $$1.add(ws.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wr.a().b(ws.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static ws a(csd $$0, String $$1) {
      ty $$2 = $$0.a(jz.F, cuq.a).d();
      akf $$3 = a($$2, $$1);
      return $$3 != null ? lc.g.b($$3).map($$0x -> ws.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static akf a(ty $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return akf.a($$2);
      } else {
         return null;
      }
   }
}
