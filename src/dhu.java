import java.util.List;
import javax.annotation.Nullable;

public interface dhu {
   void a(bvi<?> var1, bac var2);

   static void a(cxg $$0, List<xk> $$1, String $$2) {
      xk $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xj.a);
         $$1.add(xk.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xj.a().b(xk.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xk a(cxg $$0, String $$1) {
      um $$2 = $$0.a(ku.Y, czp.a).e();
      alp $$3 = a($$2, $$1);
      return $$3 != null ? ma.f.b($$3).map($$0x -> xk.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static alp a(um $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return alp.c($$2);
      } else {
         return null;
      }
   }
}
