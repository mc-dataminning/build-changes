import com.google.gson.JsonObject;

public class dd extends cv<dd.a> {
   static final aep a = new aep("target_hit");

   @Override
   public aep a() {
      return a;
   }

   public dd.a a(JsonObject $$0, ba $$1, be $$2) {
      cj.d $$3 = cj.d.a($$0.get("signal_strength"));
      ba $$4 = bo.a($$0, "projectile", $$2);
      return new dd.a($$1, $$3, $$4);
   }

   public void a(akj $$0, big $$1, ehf $$2, int $$3) {
      ech $$4 = bo.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static class a extends ar {
      private final cj.d a;
      private final ba b;

      public a(ba $$0, cj.d $$1, ba $$2) {
         super(dd.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static dd.a a(cj.d $$0, ba $$1) {
         return new dd.a(ba.a, $$0, $$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("signal_strength", this.a.d());
         $$1.add("projectile", this.b.a($$0));
         return $$1;
      }

      public boolean a(ech $$0, ehf $$1, int $$2) {
         return !this.a.d($$2) ? false : this.b.a($$0);
      }
   }
}
