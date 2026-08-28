import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface djq {
   void a(bwm<?> var1, azv var2);

   static void a(dbg $$0, Consumer<wy> $$1, String $$2) {
      wy $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.accept($$3);
      } else {
         $$1.accept(wx.a);
         $$1.accept(wy.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.accept(wx.a().b(wy.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wy a(dbg $$0, String $$1) {
      tz $$2 = $$0.e();
      alg $$3 = a($$2, $$1);
      return $$3 != null ? mf.f.b($$3).map($$0x -> wy.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static alg a(tz $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return alg.c($$2);
      } else {
         return null;
      }
   }
}
