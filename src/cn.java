import com.google.gson.JsonObject;

public class cn extends cv<cn.a> {
   static final aep a = new aep("player_hurt_entity");

   @Override
   public aep a() {
      return a;
   }

   public cn.a a(JsonObject $$0, ba $$1, be $$2) {
      bc $$3 = bc.a($$0.get("damage"));
      ba $$4 = bo.a($$0, "entity", $$2);
      return new cn.a($$1, $$3, $$4);
   }

   public void a(akj $$0, big $$1, bhe $$2, float $$3, float $$4, boolean $$5) {
      ech $$6 = bo.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static class a extends ar {
      private final bc a;
      private final ba b;

      public a(ba $$0, bc $$1, ba $$2) {
         super(cn.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cn.a c() {
         return new cn.a(ba.a, bc.a, ba.a);
      }

      public static cn.a a(bc $$0) {
         return new cn.a(ba.a, $$0, ba.a);
      }

      public static cn.a a(bc.a $$0) {
         return new cn.a(ba.a, $$0.b(), ba.a);
      }

      public static cn.a a(bo $$0) {
         return new cn.a(ba.a, bc.a, bo.a($$0));
      }

      public static cn.a a(bc $$0, bo $$1) {
         return new cn.a(ba.a, $$0, bo.a($$1));
      }

      public static cn.a a(bc.a $$0, bo $$1) {
         return new cn.a(ba.a, $$0.b(), bo.a($$1));
      }

      public boolean a(akj $$0, ech $$1, bhe $$2, float $$3, float $$4, boolean $$5) {
         return !this.a.a($$0, $$2, $$3, $$4, $$5) ? false : this.b.a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("damage", this.a.a());
         $$1.add("entity", this.b.a($$0));
         return $$1;
      }
   }
}
