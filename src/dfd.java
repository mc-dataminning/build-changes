import java.util.List;
import javax.annotation.Nullable;

public interface dfd {
   void a(bty<?> var1, azn var2);

   static void a(cvs $$0, List<xe> $$1, String $$2) {
      xe $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xd.a);
         $$1.add(xe.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xd.a().b(xe.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xe a(cvs $$0, String $$1) {
      ug $$2 = $$0.a(ks.T, cyh.a).d();
      ale $$3 = a($$2, $$1);
      return $$3 != null ? lv.f.b($$3).map($$0x -> xe.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static ale a(ug $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ale.c($$2);
      } else {
         return null;
      }
   }
}
