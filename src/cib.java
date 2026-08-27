import java.util.List;
import javax.annotation.Nullable;

public class cib extends cir {
   public cib(cir.a $$0) {
      super($$0);
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      qs $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(qs $$0, List<te> $$1) {
      cia.a $$2 = cia.a.a($$0.f("Type"));
      $$1.add(te.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(te.h().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(te.c("item.minecraft.firework_star.fade_to").b(td.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(te.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(te.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static te a(tr $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static te a(int $$0) {
      chk $$1 = chk.b($$0);
      return $$1 == null ? te.c("item.minecraft.firework_star.custom_color") : te.c("item.minecraft.firework_star." + $$1.b());
   }
}
