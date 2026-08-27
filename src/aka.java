import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class aka implements ajy<ajz> {
   public ajz b(JsonObject $$0) {
      sw $$1 = sw.a.a($$0.get("description"));
      if ($$1 == null) {
         throw new JsonParseException("Invalid/missing description!");
      } else {
         int $$2 = aor.o($$0, "pack_format");
         return new ajz($$1, $$2);
      }
   }

   public JsonObject a(ajz $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("description", sw.a.c($$0.a()));
      $$1.addProperty("pack_format", $$0.b());
      return $$1;
   }

   @Override
   public String a() {
      return "pack";
   }
}
