import com.google.common.collect.Lists;
import java.util.List;

public class deu {
   private final List<deu.a> a = Lists.newArrayList();

   public void a(je $$0, double $$1) {
      if ($$1 != 0.0) {
         this.a.add(new deu.a($$0, $$1));
      }
   }

   public double b(je $$0, double $$1) {
      if ($$1 == 0.0) {
         return 0.0;
      } else {
         double $$2 = 0.0;

         for (deu.a $$3 : this.a) {
            $$2 += $$3.a($$0);
         }

         return $$2 * $$1;
      }
   }

   static class a {
      private final je a;
      private final double b;

      public a(je $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public double a(je $$0) {
         double $$1 = this.a.j($$0);
         return $$1 == 0.0 ? Double.POSITIVE_INFINITY : this.b / Math.sqrt($$1);
      }
   }
}
