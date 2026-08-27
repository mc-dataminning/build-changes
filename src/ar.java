import com.google.gson.JsonObject;

public abstract class ar implements am {
   private final aep a;
   private final ba b;

   public ar(aep $$0, ba $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public aep a() {
      return this.a;
   }

   protected ba b() {
      return this.b;
   }

   @Override
   public JsonObject a(ct $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("player", this.b.a($$0));
      return $$1;
   }

   @Override
   public String toString() {
      return "AbstractCriterionInstance{criterion=" + this.a + "}";
   }
}
