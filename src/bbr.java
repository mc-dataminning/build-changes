import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class bbr {
   private static final String a = a("");

   public static <T> Dynamic<T> a(DynamicOps<T> $$0, String $$1) {
      String $$2 = a($$1);
      return new Dynamic($$0, $$0.createString($$2));
   }

   public static <T> Dynamic<T> a(DynamicOps<T> $$0) {
      return new Dynamic($$0, $$0.createString(a));
   }

   public static String a(String $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("text", $$0);
      return azo.e($$1);
   }

   public static String b(String $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("translate", $$0);
      return azo.e($$1);
   }

   public static <T> Dynamic<T> b(DynamicOps<T> $$0, String $$1) {
      String $$2 = b($$1);
      return new Dynamic($$0, $$0.createString($$2));
   }

   public static String c(String $$0) {
      if (!$$0.isEmpty() && !$$0.equals("null")) {
         char $$1 = $$0.charAt(0);
         char $$2 = $$0.charAt($$0.length() - 1);
         if ($$1 == '"' && $$2 == '"' || $$1 == '{' && $$2 == '}' || $$1 == '[' && $$2 == ']') {
            try {
               JsonElement $$3 = JsonParser.parseString($$0);
               if ($$3.isJsonPrimitive()) {
                  return a($$3.getAsString());
               }

               return azo.e($$3);
            } catch (JsonParseException var4) {
            }
         }

         return a($$0);
      } else {
         return a;
      }
   }

   public static Optional<String> d(String $$0) {
      try {
         JsonElement $$1 = JsonParser.parseString($$0);
         if ($$1.isJsonObject()) {
            JsonObject $$2 = $$1.getAsJsonObject();
            JsonElement $$3 = $$2.get("translate");
            if ($$3 != null && $$3.isJsonPrimitive()) {
               return Optional.of($$3.getAsString());
            }
         }
      } catch (JsonParseException var4) {
      }

      return Optional.empty();
   }
}
