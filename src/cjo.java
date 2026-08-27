import java.util.List;
import javax.annotation.Nullable;

public class cjo extends cke {
   public cjo(cke.a $$0) {
      super($$0);
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      rt $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(rt $$0, List<ui> $$1) {
      cjn.a $$2 = cjn.a.a($$0.f("Type"));
      $$1.add(ui.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(ui.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(ui.c("item.minecraft.firework_star.fade_to").b(uh.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(ui.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(ui.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static ui a(uw $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static ui a(int $$0) {
      cix $$1 = cix.b($$0);
      return $$1 == null ? ui.c("item.minecraft.firework_star.custom_color") : ui.c("item.minecraft.firework_star." + $$1.b());
   }
}
