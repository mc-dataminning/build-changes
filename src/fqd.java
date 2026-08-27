import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fqd {
   private final Map<String, fqk> a = Maps.newLinkedHashMap();
   private fqp b;

   public static fqd a(fqd.a $$0, Reader $$1) {
      return aso.a($$0.a, $$1, fqd.class);
   }

   public static fqd a(fqd.a $$0, JsonElement $$1) {
      return (fqd)$$0.a.fromJson($$1, fqd.class);
   }

   public fqd(Map<String, fqk> $$0, fqp $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fqd(List<fqd> $$0) {
      fqd $$1 = null;

      for (fqd $$2 : $$0) {
         if ($$2.c()) {
            this.a.clear();
            $$1 = $$2;
         }

         this.a.putAll($$2.a);
      }

      if ($$1 != null) {
         this.b = $$1.b;
      }
   }

   @VisibleForTesting
   public boolean a(String $$0) {
      return this.a.get($$0) != null;
   }

   @VisibleForTesting
   public fqk b(String $$0) {
      fqk $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fqd.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fqd $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fqk> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fqk> b() {
      Set<fqk> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fqp d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fqd.class, new fqd.b())
         .registerTypeAdapter(fql.class, new fql.a())
         .registerTypeAdapter(fqk.class, new fqk.a())
         .registerTypeAdapter(fqp.class, new fqp.a(this))
         .registerTypeAdapter(fqr.class, new fqr.a())
         .create();
      private dgc<cua, dgb> b;

      public dgc<cua, dgb> a() {
         return this.b;
      }

      public void a(dgc<cua, dgb> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fqd> {
      public fqd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fqk> $$4 = this.a($$2, $$3);
         fqp $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fqd($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fqk> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fqk> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = aso.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fqk)$$0.deserialize($$4.getValue(), fqk.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fqp b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = aso.v($$1, "multipart");
            return (fqp)$$0.deserialize($$2, fqp.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
