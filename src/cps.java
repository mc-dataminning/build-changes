import java.util.List;
import javax.annotation.Nullable;

public class cps extends cqh {
   public cps(cqh.a $$0) {
      super($$0);
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      ta $$4 = $$0.c("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(ta $$0, List<vu> $$1) {
      cpr.a $$2 = cpr.a.a($$0.f("Type"));
      $$1.add(vu.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(vu.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(vu.c("item.minecraft.firework_star.fade_to").b(vt.v).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(vu.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(vu.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static vu a(wi $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static vu a(int $$0) {
      cpd $$1 = cpd.b($$0);
      return $$1 == null ? vu.c("item.minecraft.firework_star.custom_color") : vu.c("item.minecraft.firework_star." + $$1.b());
   }
}
