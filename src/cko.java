import java.util.List;
import javax.annotation.Nullable;

public class cko extends cle {
   public cko(cle.a $$0) {
      super($$0);
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      rz $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(rz $$0, List<ur> $$1) {
      ckn.a $$2 = ckn.a.a($$0.f("Type"));
      $$1.add(ur.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(ur.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(ur.c("item.minecraft.firework_star.fade_to").b(uq.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(ur.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(ur.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static ur a(vf $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static ur a(int $$0) {
      cjx $$1 = cjx.b($$0);
      return $$1 == null ? ur.c("item.minecraft.firework_star.custom_color") : ur.c("item.minecraft.firework_star." + $$1.b());
   }
}
