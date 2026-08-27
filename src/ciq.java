import java.util.List;
import javax.annotation.Nullable;

public class ciq extends cjg {
   public ciq(cjg.a $$0) {
      super($$0);
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      qw $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(qw $$0, List<tl> $$1) {
      cip.a $$2 = cip.a.a($$0.f("Type"));
      $$1.add(tl.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(tl.i().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(tl.c("item.minecraft.firework_star.fade_to").b(tk.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(tl.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(tl.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static tl a(tz $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static tl a(int $$0) {
      chz $$1 = chz.b($$0);
      return $$1 == null ? tl.c("item.minecraft.firework_star.custom_color") : tl.c("item.minecraft.firework_star." + $$1.b());
   }
}
