import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class fnh implements Supplier<JsonElement> {
   private final Map<fnj<?>, fnj<?>.a> a = Maps.newLinkedHashMap();

   public <T> fnh a(fnj<T> $$0, T $$1) {
      fnj<?>.a $$2 = this.a.put($$0, $$0.a($$1));
      if ($$2 != null) {
         throw new IllegalStateException("Replacing value of " + $$2 + " with " + $$1);
      } else {
         return this;
      }
   }

   public static fnh a() {
      return new fnh();
   }

   public static fnh a(fnh $$0, fnh $$1) {
      fnh $$2 = new fnh();
      $$2.a.putAll($$0.a);
      $$2.a.putAll($$1.a);
      return $$2;
   }

   public JsonElement b() {
      JsonObject $$0 = new JsonObject();
      this.a.values().forEach($$1 -> $$1.a($$0));
      return $$0;
   }

   public static JsonElement a(List<fnh> $$0) {
      if ($$0.size() == 1) {
         return $$0.get(0).b();
      } else {
         JsonArray $$1 = new JsonArray();
         $$0.forEach($$1x -> $$1.add($$1x.b()));
         return $$1;
      }
   }
}
