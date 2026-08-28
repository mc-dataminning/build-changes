import java.util.List;
import javax.annotation.Nullable;

public interface dem {
   void a(btq<?> var1, azk var2);

   static void a(cvl $$0, List<xd> $$1, String $$2) {
      xd $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xc.a);
         $$1.add(xd.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xc.a().b(xd.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xd a(cvl $$0, String $$1) {
      uf $$2 = $$0.a(kr.Q, cya.a).d();
      alb $$3 = a($$2, $$1);
      return $$3 != null ? lu.f.b($$3).map($$0x -> xd.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static alb a(uf $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return alb.c($$2);
      } else {
         return null;
      }
   }
}
