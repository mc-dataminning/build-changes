import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class fnp implements fnr {
   private final akv a;

   public fnp(akv $$0) {
      this.a = $$0;
   }

   public JsonElement a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("parent", this.a.toString());
      return $$0;
   }
}
