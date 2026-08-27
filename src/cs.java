import com.google.gson.JsonObject;

public class cs extends cv<cs.a> {
   static final aep a = new aep("recipe_unlocked");

   @Override
   public aep a() {
      return a;
   }

   public cs.a a(JsonObject $$0, ba $$1, be $$2) {
      aep $$3 = new aep(arf.i($$0, "recipe"));
      return new cs.a($$1, $$3);
   }

   public void a(akj $$0, clz<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static cs.a a(aep $$0) {
      return new cs.a(ba.a, $$0);
   }

   public static class a extends ar {
      private final aep a;

      public a(ba $$0, aep $$1) {
         super(cs.a, $$0);
         this.a = $$1;
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.addProperty("recipe", this.a.toString());
         return $$1;
      }

      public boolean a(clz<?> $$0) {
         return this.a.equals($$0.e());
      }
   }
}
