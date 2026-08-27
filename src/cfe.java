import java.util.List;
import javax.annotation.Nullable;

public class cfe extends cfu {
   public cfe(cfu.a $$0) {
      super($$0);
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      qr $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(qr $$0, List<sw> $$1) {
      cfd.a $$2 = cfd.a.a($$0.f("Type"));
      $$1.add(sw.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(sw.h().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(sw.c("item.minecraft.firework_star.fade_to").b(sv.t).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(sw.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(sw.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static sw a(tj $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static sw a(int $$0) {
      cen $$1 = cen.b($$0);
      return $$1 == null ? sw.c("item.minecraft.firework_star.custom_color") : sw.c("item.minecraft.firework_star." + $$1.b());
   }
}
