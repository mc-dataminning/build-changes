import java.util.List;
import javax.annotation.Nullable;

public interface dcl {
   void a(bsv<?> var1, azc var2);

   static void a(cuk $$0, List<xl> $$1, String $$2) {
      xl $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xk.a);
         $$1.add(xl.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xk.a().b(xl.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xl a(cuk $$0, String $$1) {
      ur $$2 = $$0.a(km.N, cwz.a).d();
      alb $$3 = a($$2, $$1);
      return $$3 != null ? lp.g.b($$3).map($$0x -> xl.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static alb a(ur $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return alb.a($$2);
      } else {
         return null;
      }
   }
}
