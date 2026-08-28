import java.util.List;
import javax.annotation.Nullable;

public interface ddn {
   void a(bsw<?> var1, ayv var2);

   static void a(cuo $$0, List<wy> $$1, String $$2) {
      wy $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wx.a);
         $$1.add(wy.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wx.a().b(wy.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wy a(cuo $$0, String $$1) {
      ua $$2 = $$0.a(kq.O, cxf.a).d();
      akq $$3 = a($$2, $$1);
      return $$3 != null ? lt.f.b($$3).map($$0x -> wy.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static akq a(ua $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return akq.c($$2);
      } else {
         return null;
      }
   }
}
