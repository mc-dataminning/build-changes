import java.util.List;
import javax.annotation.Nullable;

public class clw extends cmm {
   public clw(cmm.a $$0) {
      super($$0);
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      sl $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(sl $$0, List<vd> $$1) {
      clv.a $$2 = clv.a.a($$0.f("Type"));
      $$1.add(vd.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(vd.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(vd.c("item.minecraft.firework_star.fade_to").b(vc.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(vd.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(vd.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static vd a(vr $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static vd a(int $$0) {
      clf $$1 = clf.b($$0);
      return $$1 == null ? vd.c("item.minecraft.firework_star.custom_color") : vd.c("item.minecraft.firework_star." + $$1.b());
   }
}
