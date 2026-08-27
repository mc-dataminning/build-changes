import java.util.List;
import javax.annotation.Nullable;

public class cow extends cpl {
   public cow(cpl.a $$0) {
      super($$0);
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      sy $$4 = $$0.c("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(sy $$0, List<vs> $$1) {
      cov.a $$2 = cov.a.a($$0.f("Type"));
      $$1.add(vs.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(vs.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(vs.c("item.minecraft.firework_star.fade_to").b(vr.v).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(vs.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(vs.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static vs a(wg $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static vs a(int $$0) {
      cog $$1 = cog.b($$0);
      return $$1 == null ? vs.c("item.minecraft.firework_star.custom_color") : vs.c("item.minecraft.firework_star." + $$1.b());
   }
}
