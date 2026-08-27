import java.util.List;
import javax.annotation.Nullable;

public class ckt extends clj {
   public ckt(clj.a $$0) {
      super($$0);
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      sd $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(sd $$0, List<uv> $$1) {
      cks.a $$2 = cks.a.a($$0.f("Type"));
      $$1.add(uv.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(uv.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(uv.c("item.minecraft.firework_star.fade_to").b(uu.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(uv.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(uv.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static uv a(vj $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static uv a(int $$0) {
      ckc $$1 = ckc.b($$0);
      return $$1 == null ? uv.c("item.minecraft.firework_star.custom_color") : uv.c("item.minecraft.firework_star." + $$1.b());
   }
}
