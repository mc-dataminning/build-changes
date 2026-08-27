import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public record am<T extends ap>(ao<T> a, T b) {
   public static am<?> a(JsonObject $$0, bg $$1) {
      aex $$2 = new aex(aro.i($$0, "trigger"));
      ao<?> $$3 = al.a($$2);
      if ($$3 == null) {
         throw new JsonSyntaxException("Invalid criterion trigger: " + $$2);
      } else {
         return a($$0, $$1, $$3);
      }
   }

   private static <T extends ap> am<T> a(JsonObject $$0, bg $$1, ao<T> $$2) {
      T $$3 = $$2.a(aro.a($$0, "conditions", new JsonObject()), $$1);
      return new am<>($$2, $$3);
   }

   public static Map<String, am<?>> b(JsonObject $$0, bg $$1) {
      Map<String, am<?>> $$2 = Maps.newHashMap();

      for (Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         $$2.put($$3.getKey(), a(aro.m($$3.getValue(), "criterion"), $$1));
      }

      return $$2;
   }

   public JsonElement a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("trigger", Objects.requireNonNull(al.a(this.a), "Unregistered trigger").toString());
      JsonObject $$1 = this.b.a();
      if ($$1.size() != 0) {
         $$0.add("conditions", $$1);
      }

      return $$0;
   }

   public ao<T> b() {
      return this.a;
   }

   public T c() {
      return this.b;
   }
}
