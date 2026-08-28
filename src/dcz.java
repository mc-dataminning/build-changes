import java.util.List;
import javax.annotation.Nullable;

public interface dcz {
   void a(bsn<?> var1, ayo var2);

   static void a(cud $$0, List<wu> $$1, String $$2) {
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
   static wu a(cud $$0, String $$1) {
      tx $$2 = $$0.a(kn.O, cwr.a).d();
      akk $$3 = a($$2, $$1);
      return $$3 != null ? lq.f.b($$3).map($$0x -> wu.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static akk a(tx $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return akk.a($$2);
      } else {
         return null;
      }
   }
}
