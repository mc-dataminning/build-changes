import java.util.List;
import javax.annotation.Nullable;

public class cif extends civ {
   public cif(civ.a $$0) {
      super($$0);
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      qu $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(qu $$0, List<ti> $$1) {
      cie.a $$2 = cie.a.a($$0.f("Type"));
      $$1.add(ti.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(ti.h().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(ti.c("item.minecraft.firework_star.fade_to").b(th.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(ti.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(ti.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static ti a(tv $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static ti a(int $$0) {
      cho $$1 = cho.b($$0);
      return $$1 == null ? ti.c("item.minecraft.firework_star.custom_color") : ti.c("item.minecraft.firework_star." + $$1.b());
   }
}
