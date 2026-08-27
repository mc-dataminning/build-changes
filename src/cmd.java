import java.util.List;
import javax.annotation.Nullable;

public class cmd extends cmt {
   public cmd(cmt.a $$0) {
      super($$0);
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      sn $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(sn $$0, List<vf> $$1) {
      cmc.a $$2 = cmc.a.a($$0.f("Type"));
      $$1.add(vf.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(vf.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(vf.c("item.minecraft.firework_star.fade_to").b(ve.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(vf.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(vf.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static vf a(vt $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static vf a(int $$0) {
      clm $$1 = clm.b($$0);
      return $$1 == null ? vf.c("item.minecraft.firework_star.custom_color") : vf.c("item.minecraft.firework_star." + $$1.b());
   }
}
