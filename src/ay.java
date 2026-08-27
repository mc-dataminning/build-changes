import com.google.gson.JsonObject;

public class ay extends cv<ay.a> {
   static final aep a = new aep("construct_beacon");

   @Override
   public aep a() {
      return a;
   }

   public ay.a a(JsonObject $$0, ba $$1, be $$2) {
      cj.d $$3 = cj.d.a($$0.get("level"));
      return new ay.a($$1, $$3);
   }

   public void a(akj $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final cj.d a;

      public a(ba $$0, cj.d $$1) {
         super(ay.a, $$0);
         this.a = $$1;
      }

      public static ay.a c() {
         return new ay.a(ba.a, cj.d.e);
      }

      public static ay.a a(cj.d $$0) {
         return new ay.a(ba.a, $$0);
      }

      public boolean a(int $$0) {
         return this.a.d($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("level", this.a.d());
         return $$1;
      }
   }
}
