import com.google.gson.JsonObject;
import java.util.Optional;

public class de extends cu<de.a> {
   static final aer a = new aer("used_ender_eye");

   @Override
   public aer a() {
      return a;
   }

   public de.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      cj.c $$3 = cj.c.a($$0.get("distance"));
      return new de.a($$1, $$3);
   }

   public void a(akl $$0, gu $$1) {
      double $$2 = $$0.dp() - (double)$$1.u();
      double $$3 = $$0.dv() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static class a extends ar {
      private final cj.c a;

      public a(Optional<ba> $$0, cj.c $$1) {
         super(de.a, $$0);
         this.a = $$1;
      }

      public boolean a(double $$0) {
         return this.a.e($$0);
      }
   }
}
