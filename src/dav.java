import java.util.List;
import javax.annotation.Nullable;

public interface dav {
   void a(brn<?> var1, ayg var2);

   static void a(csz $$0, List<wu> $$1, String $$2) {
      wu $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wt.a);
         $$1.add(wu.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wt.a().b(wu.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wu a(csz $$0, String $$1) {
      ua $$2 = $$0.a(ka.M, cvm.a).d();
      akh $$3 = a($$2, $$1);
      return $$3 != null ? ld.g.b($$3).map($$0x -> wu.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static akh a(ua $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return akh.a($$2);
      } else {
         return null;
      }
   }
}
