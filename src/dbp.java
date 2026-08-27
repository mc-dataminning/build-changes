import java.util.List;
import javax.annotation.Nullable;

public interface dbp {
   void a(bsa<?> var1, ayk var2);

   static void a(cto $$0, List<wx> $$1, String $$2) {
      wx $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(ww.a);
         $$1.add(wx.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(ww.a().b(wx.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wx a(cto $$0, String $$1) {
      ud $$2 = $$0.a(kb.N, cwd.a).d();
      akm $$3 = a($$2, $$1);
      return $$3 != null ? le.g.b($$3).map($$0x -> wx.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static akm a(ud $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return akm.a($$2);
      } else {
         return null;
      }
   }
}
