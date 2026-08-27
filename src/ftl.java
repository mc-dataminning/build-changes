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

public class ftl {
   private final Map<String, fts> a = Maps.newLinkedHashMap();
   private ftx b;

   public static ftl a(ftl.a $$0, Reader $$1) {
      return ato.a($$0.a, $$1, ftl.class);
   }

   public static ftl a(ftl.a $$0, JsonElement $$1) {
      return (ftl)$$0.a.fromJson($$1, ftl.class);
   }

   public ftl(Map<String, fts> $$0, ftx $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public ftl(List<ftl> $$0) {
      ftl $$1 = null;

      for (ftl $$2 : $$0) {
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
   public fts b(String $$0) {
      fts $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new ftl.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ftl $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fts> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fts> b() {
      Set<fts> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public ftx d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(ftl.class, new ftl.b())
         .registerTypeAdapter(ftt.class, new ftt.a())
         .registerTypeAdapter(fts.class, new fts.a())
         .registerTypeAdapter(ftx.class, new ftx.a(this))
         .registerTypeAdapter(ftz.class, new ftz.a())
         .create();
      private diq<cvz, dip> b;

      public diq<cvz, dip> a() {
         return this.b;
      }

      public void a(diq<cvz, dip> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<ftl> {
      public ftl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fts> $$4 = this.a($$2, $$3);
         ftx $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new ftl($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fts> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fts> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = ato.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fts)$$0.deserialize($$4.getValue(), fts.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected ftx b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = ato.v($$1, "multipart");
            return (ftx)$$0.deserialize($$2, ftx.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
