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

public class fuc {
   private final Map<String, fuj> a = Maps.newLinkedHashMap();
   private fuo b;

   public static fuc a(fuc.a $$0, Reader $$1) {
      return aty.a($$0.a, $$1, fuc.class);
   }

   public static fuc a(fuc.a $$0, JsonElement $$1) {
      return (fuc)$$0.a.fromJson($$1, fuc.class);
   }

   public fuc(Map<String, fuj> $$0, fuo $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fuc(List<fuc> $$0) {
      fuc $$1 = null;

      for (fuc $$2 : $$0) {
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
   public fuj b(String $$0) {
      fuj $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fuc.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fuc $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fuj> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fuj> b() {
      Set<fuj> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fuo d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fuc.class, new fuc.b())
         .registerTypeAdapter(fuk.class, new fuk.a())
         .registerTypeAdapter(fuj.class, new fuj.a())
         .registerTypeAdapter(fuo.class, new fuo.a(this))
         .registerTypeAdapter(fuq.class, new fuq.a())
         .create();
      private djb<cwj, dja> b;

      public djb<cwj, dja> a() {
         return this.b;
      }

      public void a(djb<cwj, dja> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fuc> {
      public fuc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fuj> $$4 = this.a($$2, $$3);
         fuo $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fuc($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fuj> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fuj> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = aty.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fuj)$$0.deserialize($$4.getValue(), fuj.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fuo b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = aty.v($$1, "multipart");
            return (fuo)$$0.deserialize($$2, fuo.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
