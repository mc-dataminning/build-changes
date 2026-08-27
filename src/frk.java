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

public class frk {
   private final Map<String, frr> a = Maps.newLinkedHashMap();
   private frw b;

   public static frk a(frk.a $$0, Reader $$1) {
      return asy.a($$0.a, $$1, frk.class);
   }

   public static frk a(frk.a $$0, JsonElement $$1) {
      return (frk)$$0.a.fromJson($$1, frk.class);
   }

   public frk(Map<String, frr> $$0, frw $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public frk(List<frk> $$0) {
      frk $$1 = null;

      for (frk $$2 : $$0) {
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
   public frr b(String $$0) {
      frr $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new frk.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof frk $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, frr> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<frr> b() {
      Set<frr> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public frw d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(frk.class, new frk.b())
         .registerTypeAdapter(frs.class, new frs.a())
         .registerTypeAdapter(frr.class, new frr.a())
         .registerTypeAdapter(frw.class, new frw.a(this))
         .registerTypeAdapter(fry.class, new fry.a())
         .create();
      private dgx<cut, dgw> b;

      public dgx<cut, dgw> a() {
         return this.b;
      }

      public void a(dgx<cut, dgw> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<frk> {
      public frk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, frr> $$4 = this.a($$2, $$3);
         frw $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new frk($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, frr> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, frr> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = asy.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (frr)$$0.deserialize($$4.getValue(), frr.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected frw b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = asy.v($$1, "multipart");
            return (frw)$$0.deserialize($$2, frw.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
