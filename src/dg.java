import com.google.gson.JsonObject;

public class dg extends cv<dg.a> {
   static final aep a = new aep("used_totem");

   @Override
   public aep a() {
      return a;
   }

   public dg.a a(JsonObject $$0, ba $$1, be $$2) {
      bz $$3 = bz.a($$0.get("item"));
      return new dg.a($$1, $$3);
   }

   public void a(akj $$0, ciw $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final bz a;

      public a(ba $$0, bz $$1) {
         super(dg.a, $$0);
         this.a = $$1;
      }

      public static dg.a a(bz $$0) {
         return new dg.a(ba.a, $$0);
      }

      public static dg.a a(cpj $$0) {
         return new dg.a(ba.a, bz.a.a().a($$0).b());
      }

      public boolean a(ciw $$0) {
         return this.a.a($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         return $$1;
      }
   }
}
