import com.google.gson.JsonObject;

public class df extends cv<df.a> {
   static final aep a = new aep("used_ender_eye");

   @Override
   public aep a() {
      return a;
   }

   public df.a a(JsonObject $$0, ba $$1, be $$2) {
      cj.c $$3 = cj.c.a($$0.get("distance"));
      return new df.a($$1, $$3);
   }

   public void a(akj $$0, gv $$1) {
      double $$2 = $$0.dp() - (double)$$1.u();
      double $$3 = $$0.dv() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static class a extends ar {
      private final cj.c a;

      public a(ba $$0, cj.c $$1) {
         super(df.a, $$0);
         this.a = $$1;
      }

      public boolean a(double $$0) {
         return this.a.e($$0);
      }
   }
}
