import com.google.gson.JsonObject;
import java.util.Optional;

public class dg extends cw<dg.a> {
   public dg.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      cl.c $$3 = cl.c.a($$0.get("distance"));
      return new dg.a($$1, $$3);
   }

   public void a(alr $$0, ht $$1) {
      double $$2 = $$0.dq() - (double)$$1.u();
      double $$3 = $$0.dw() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static class a extends at {
      private final cl.c a;

      public a(Optional<bc> $$0, cl.c $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a(double $$0) {
         return this.a.e($$0);
      }
   }
}
