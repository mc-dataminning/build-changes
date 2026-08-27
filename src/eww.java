import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.util.UndashedUuid;
import java.util.Date;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class eww {
   public static <T> T a(String $$0, JsonObject $$1, Function<JsonObject, T> $$2) {
      JsonElement $$3 = $$1.get($$0);
      if ($$3 == null || $$3.isJsonNull()) {
         throw new IllegalStateException("Missing required property: " + $$0);
      } else if (!$$3.isJsonObject()) {
         throw new IllegalStateException("Required property " + $$0 + " was not a JsonObject as espected");
      } else {
         return $$2.apply($$3.getAsJsonObject());
      }
   }

   @Nullable
   public static <T> T b(String $$0, JsonObject $$1, Function<JsonObject, T> $$2) {
      JsonElement $$3 = $$1.get($$0);
      if ($$3 == null || $$3.isJsonNull()) {
         return null;
      } else if (!$$3.isJsonObject()) {
         throw new IllegalStateException("Required property " + $$0 + " was not a JsonObject as espected");
      } else {
         return $$2.apply($$3.getAsJsonObject());
      }
   }

   public static String a(String $$0, JsonObject $$1) {
      String $$2 = b($$0, $$1, null);
      if ($$2 == null) {
         throw new IllegalStateException("Missing required property: " + $$0);
      } else {
         return $$2;
      }
   }

   public static String a(String $$0, JsonObject $$1, String $$2) {
      JsonElement $$3 = $$1.get($$0);
      if ($$3 != null) {
         return $$3.isJsonNull() ? $$2 : $$3.getAsString();
      } else {
         return $$2;
      }
   }

   @Nullable
   public static String b(String $$0, JsonObject $$1, @Nullable String $$2) {
      JsonElement $$3 = $$1.get($$0);
      if ($$3 != null) {
         return $$3.isJsonNull() ? $$2 : $$3.getAsString();
      } else {
         return $$2;
      }
   }

   @Nullable
   public static UUID a(String $$0, JsonObject $$1, @Nullable UUID $$2) {
      String $$3 = b($$0, $$1, null);
      return $$3 == null ? $$2 : UndashedUuid.fromStringLenient($$3);
   }

   public static int a(String $$0, JsonObject $$1, int $$2) {
      JsonElement $$3 = $$1.get($$0);
      if ($$3 != null) {
         return $$3.isJsonNull() ? $$2 : $$3.getAsInt();
      } else {
         return $$2;
      }
   }

   public static long a(String $$0, JsonObject $$1, long $$2) {
      JsonElement $$3 = $$1.get($$0);
      if ($$3 != null) {
         return $$3.isJsonNull() ? $$2 : $$3.getAsLong();
      } else {
         return $$2;
      }
   }

   public static boolean a(String $$0, JsonObject $$1, boolean $$2) {
      JsonElement $$3 = $$1.get($$0);
      if ($$3 != null) {
         return $$3.isJsonNull() ? $$2 : $$3.getAsBoolean();
      } else {
         return $$2;
      }
   }

   public static Date b(String $$0, JsonObject $$1) {
      JsonElement $$2 = $$1.get($$0);
      return $$2 != null ? new Date(Long.parseLong($$2.getAsString())) : new Date();
   }
}
