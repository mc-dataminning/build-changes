import java.util.List;
import javax.annotation.Nullable;

public class cic extends cis {
   public cic(cis.a $$0) {
      super($$0);
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      qr $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }
   }

   public static void a(qr $$0, List<tf> $$1) {
      cib.a $$2 = cib.a.a($$0.f("Type"));
      $$1.add(tf.c("item.minecraft.firework_star.shape." + $$2.b()).a(n.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(tf.h().a(n.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(tf.c("item.minecraft.firework_star.fade_to").b(te.u).a(n.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(tf.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(tf.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static tf a(ts $$0, int[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static tf a(int $$0) {
      chl $$1 = chl.b($$0);
      return $$1 == null ? tf.c("item.minecraft.firework_star.custom_color") : tf.c("item.minecraft.firework_star." + $$1.b());
   }
}
