import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class baw {
   private static final String a = b("");

   public static <T> Dynamic<T> a(DynamicOps<T> $$0, String $$1) {
      String $$2 = b($$1);
      return new Dynamic($$0, $$0.createString($$2));
   }

   public static <T> Dynamic<T> a(DynamicOps<T> $$0) {
      return new Dynamic($$0, $$0.createString(a));
   }

   private static String b(String $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("text", $$0);
      return azd.e($$1);
   }

   public static <T> Dynamic<T> b(DynamicOps<T> $$0, String $$1) {
      JsonObject $$2 = new JsonObject();
      $$2.addProperty("translate", $$1);
      return new Dynamic($$0, $$0.createString(azd.e($$2)));
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0) {
      return (Dynamic<T>)DataFixUtils.orElse($$0.asString().map($$1 -> a($$0.getOps(), $$1)).result(), $$0);
   }

   public static Dynamic<?> b(Dynamic<?> $$0) {
      Optional<String> $$1 = $$0.asString().result();
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         String $$2 = $$1.get();
         if (!$$2.isEmpty() && !$$2.equals("null")) {
            char $$3 = $$2.charAt(0);
            char $$4 = $$2.charAt($$2.length() - 1);
            if ($$3 == '"' && $$4 == '"' || $$3 == '{' && $$4 == '}' || $$3 == '[' && $$4 == ']') {
               try {
                  JsonElement $$5 = JsonParser.parseString($$2);
                  if ($$5.isJsonPrimitive()) {
                     return a($$0.getOps(), $$5.getAsString());
                  }

                  return $$0.createString(azd.e($$5));
               } catch (JsonParseException var6) {
               }
            }

            return a($$0.getOps(), $$2);
         } else {
            return a($$0.getOps());
         }
      }
   }

   public static Optional<String> a(String $$0) {
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
