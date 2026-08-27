import java.util.List;
import javax.annotation.Nullable;

public interface dcs {
   void a(bsb<?> var1, ayt var2);

   static void a(cuh $$0, List<xe> $$1, String $$2) {
      xe $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xd.a);
         $$1.add(xe.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xd.a().a(xe.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xe a(cuh $$0, String $$1) {
      uk $$2 = $$0.a(ke.O, cxf.a).d();
      akt $$3 = a($$2, $$1);
      return $$3 != null ? lh.g.b($$3).map($$0x -> xe.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static akt a(uk $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return akt.a($$2);
      } else {
         return null;
      }
   }
}
