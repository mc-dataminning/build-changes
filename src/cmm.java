import java.util.List;
import javax.annotation.Nullable;

public class cmm extends cnb {
   public cmm(cnb.a $$0) {
      super($$0);
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      so $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(so $$0, List<vg> $$1) {
      cml.a $$2 = cml.a.a($$0.f("Type"));
      $$1.add(vg.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(vg.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(vg.c("item.minecraft.firework_star.fade_to").b(vf.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(vg.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(vg.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static vg a(vu $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static vg a(int $$0) {
      clv $$1 = clv.b($$0);
      return $$1 == null ? vg.c("item.minecraft.firework_star.custom_color") : vg.c("item.minecraft.firework_star." + $$1.b());
   }
}
