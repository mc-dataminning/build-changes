import java.util.List;
import javax.annotation.Nullable;

public final class bhw {
   public static tf a(bhv $$0, float $$1) {
      if ($$0.b()) {
         return tf.c("effect.duration.infinite");
      } else {
         int $$2 = arp.d((float)$$0.d() * $$1);
         return tf.b(asi.a($$2));
      }
   }

   public static boolean a(biy $$0) {
      return $$0.a(bhx.c) || $$0.a(bhx.C);
   }

   public static int b(biy $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bhx.c)) {
         $$1 = $$0.b(bhx.c).e();
      }

      if ($$0.a(bhx.C)) {
         $$2 = $$0.b(bhx.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(biy $$0) {
      return $$0.a(bhx.m) || $$0.a(bhx.C);
   }

   public static List<akl> a(akk $$0, @Nullable bii $$1, ehd $$2, double $$3, bhv $$4, int $$5) {
      bht $$6 = $$4.c();
      List<akl> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ho)$$6x.di(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bhv($$4), $$1));
      return $$7;
   }
}
