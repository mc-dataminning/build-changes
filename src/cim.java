import java.util.List;
import javax.annotation.Nullable;

public class cim extends cjc {
   public cim(cjc.a $$0) {
      super($$0);
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      qy $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(qy $$0, List<tn> $$1) {
      cil.a $$2 = cil.a.a($$0.f("Type"));
      $$1.add(tn.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(tn.h().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(tn.c("item.minecraft.firework_star.fade_to").b(tm.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(tn.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(tn.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static tn a(ua $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static tn a(int $$0) {
      chv $$1 = chv.b($$0);
      return $$1 == null ? tn.c("item.minecraft.firework_star.custom_color") : tn.c("item.minecraft.firework_star." + $$1.b());
   }
}
