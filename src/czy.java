import java.util.List;
import javax.annotation.Nullable;

public interface czy {
   void a(bqg<?> var1, axt var2);

   static void a(crs $$0, List<wi> $$1, String $$2) {
      wi $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wh.a);
         $$1.add(wi.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wh.a().b(wi.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wi a(crs $$0, String $$1) {
      to $$2 = $$0.a(jr.F, cuc.a).d();
      ajv $$3 = a($$2, $$1);
      return $$3 != null ? kt.g.b($$3).map($$0x -> wi.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static ajv a(to $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ajv.a($$2);
      } else {
         return null;
      }
   }
}
