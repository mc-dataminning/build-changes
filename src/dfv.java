import java.util.List;
import javax.annotation.Nullable;

public interface dfv {
   void a(bul<?> var1, azs var2);

   static void a(cwb $$0, List<xi> $$1, String $$2) {
      xi $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xh.a);
         $$1.add(xi.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xh.a().b(xi.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xi a(cwb $$0, String $$1) {
      uk $$2 = $$0.a(ku.Y, cyk.a).d();
      ali $$3 = a($$2, $$1);
      return $$3 != null ? ly.f.b($$3).map($$0x -> xi.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static ali a(uk $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ali.c($$2);
      } else {
         return null;
      }
   }
}
