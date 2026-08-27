import com.google.gson.JsonObject;

public class ci extends cv<ci.a> {
   static final aep a = new aep("player_generates_container_loot");

   @Override
   public aep a() {
      return a;
   }

   protected ci.a a(JsonObject $$0, ba $$1, be $$2) {
      aep $$3 = new aep(arf.i($$0, "loot_table"));
      return new ci.a($$1, $$3);
   }

   public void a(akj $$0, aep $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static class a extends ar {
      private final aep a;

      public a(ba $$0, aep $$1) {
         super(ci.a, $$0);
         this.a = $$1;
      }

      public static ci.a a(aep $$0) {
         return new ci.a(ba.a, $$0);
      }

      public boolean b(aep $$0) {
         return this.a.equals($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.addProperty("loot_table", this.a.toString());
         return $$1;
      }
   }
}
