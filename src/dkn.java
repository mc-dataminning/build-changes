import com.google.common.collect.Lists;
import java.util.List;

public class dkn {
   private final List<dkn.a> a = Lists.newArrayList();

   public void a(iw $$0, double $$1) {
      if ($$1 != 0.0) {
         this.a.add(new dkn.a($$0, $$1));
      }
   }

   public double b(iw $$0, double $$1) {
      if ($$1 == 0.0) {
         return 0.0;
      } else {
         double $$2 = 0.0;

         for (dkn.a $$3 : this.a) {
            $$2 += $$3.a($$0);
         }

         return $$2 * $$1;
      }
   }

   static class a {
      private final iw a;
      private final double b;

      public a(iw $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public double a(iw $$0) {
         double $$1 = this.a.j($$0);
         return $$1 == 0.0 ? Double.POSITIVE_INFINITY : this.b / Math.sqrt($$1);
      }
   }
}
