import java.util.List;
import javax.annotation.Nullable;

public class coe extends cou {
   public coe(cou.a $$0) {
      super($$0);
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      sw $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(sw $$0, List<vq> $$1) {
      cod.a $$2 = cod.a.a($$0.f("Type"));
      $$1.add(vq.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(vq.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(vq.c("item.minecraft.firework_star.fade_to").b(vp.v).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(vq.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(vq.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static vq a(we $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static vq a(int $$0) {
      cnn $$1 = cnn.b($$0);
      return $$1 == null ? vq.c("item.minecraft.firework_star.custom_color") : vq.c("item.minecraft.firework_star." + $$1.b());
   }
}
