import java.util.List;
import javax.annotation.Nullable;

public class clm extends cmc {
   public clm(cmc.a $$0) {
      super($$0);
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      sj $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(sj $$0, List<vb> $$1) {
      cll.a $$2 = cll.a.a($$0.f("Type"));
      $$1.add(vb.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(vb.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(vb.c("item.minecraft.firework_star.fade_to").b(va.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(vb.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(vb.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static vb a(vp $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static vb a(int $$0) {
      ckv $$1 = ckv.b($$0);
      return $$1 == null ? vb.c("item.minecraft.firework_star.custom_color") : vb.c("item.minecraft.firework_star." + $$1.b());
   }
}
