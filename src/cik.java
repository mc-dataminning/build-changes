import java.util.List;
import javax.annotation.Nullable;

public class cik extends cja {
   public cik(cja.a $$0) {
      super($$0);
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tm> $$2, ckw $$3) {
      qy $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(qy $$0, List<tm> $$1) {
      cij.a $$2 = cij.a.a($$0.f("Type"));
      $$1.add(tm.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(tm.h().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(tm.c("item.minecraft.firework_star.fade_to").b(tl.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(tm.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(tm.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static tm a(tz $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static tm a(int $$0) {
      cht $$1 = cht.b($$0);
      return $$1 == null ? tm.c("item.minecraft.firework_star.custom_color") : tm.c("item.minecraft.firework_star." + $$1.b());
   }
}
