import java.util.List;
import javax.annotation.Nullable;

public interface ddp {
   void a(bsx<?> var1, ayw var2);

   static void a(cuq $$0, List<wz> $$1, String $$2) {
      wz $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wy.a);
         $$1.add(wz.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wy.a().b(wz.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wz a(cuq $$0, String $$1) {
      ub $$2 = $$0.a(kq.O, cxh.a).d();
      akr $$3 = a($$2, $$1);
      return $$3 != null ? lt.f.b($$3).map($$0x -> wz.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static akr a(ub $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return akr.c($$2);
      } else {
         return null;
      }
   }
}
