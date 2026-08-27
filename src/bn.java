import com.google.gson.JsonObject;

public class bn extends cv<bn.a> {
   static final aep a = new aep("entity_hurt_player");

   @Override
   public aep a() {
      return a;
   }

   public bn.a a(JsonObject $$0, ba $$1, be $$2) {
      bc $$3 = bc.a($$0.get("damage"));
      return new bn.a($$1, $$3);
   }

   public void a(akj $$0, bhe $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static class a extends ar {
      private final bc a;

      public a(ba $$0, bc $$1) {
         super(bn.a, $$0);
         this.a = $$1;
      }

      public static bn.a c() {
         return new bn.a(ba.a, bc.a);
      }

      public static bn.a a(bc $$0) {
         return new bn.a(ba.a, $$0);
      }

      public static bn.a a(bc.a $$0) {
         return new bn.a(ba.a, $$0.b());
      }

      public boolean a(akj $$0, bhe $$1, float $$2, float $$3, boolean $$4) {
         return this.a.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("damage", this.a.a());
         return $$1;
      }
   }
}
