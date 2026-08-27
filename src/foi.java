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

public class foi {
   private final Map<String, fop> a = Maps.newLinkedHashMap();
   private fov b;

   public static foi a(foi.a $$0, Reader $$1) {
      return arf.a($$0.a, $$1, foi.class);
   }

   public static foi a(foi.a $$0, JsonElement $$1) {
      return (foi)$$0.a.fromJson($$1, foi.class);
   }

   public foi(Map<String, fop> $$0, fov $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public foi(List<foi> $$0) {
      foi $$1 = null;

      for (foi $$2 : $$0) {
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
   public fop b(String $$0) {
      fop $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new foi.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof foi $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fop> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fop> b() {
      Set<fop> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fov d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(foi.class, new foi.b())
         .registerTypeAdapter(foq.class, new foq.a())
         .registerTypeAdapter(fop.class, new fop.a())
         .registerTypeAdapter(fov.class, new fov.a(this))
         .registerTypeAdapter(fox.class, new fox.a())
         .create();
      private dez<csk, dey> b;

      public dez<csk, dey> a() {
         return this.b;
      }

      public void a(dez<csk, dey> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<foi> {
      public foi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fop> $$4 = this.a($$2, $$3);
         fov $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new foi($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fop> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fop> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = arf.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fop)$$0.deserialize($$4.getValue(), fop.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fov b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = arf.v($$1, "multipart");
            return (fov)$$0.deserialize($$2, fov.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
