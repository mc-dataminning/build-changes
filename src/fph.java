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

public class fph {
   private final Map<String, fpo> a = Maps.newLinkedHashMap();
   private fpt b;

   public static fph a(fph.a $$0, Reader $$1) {
      return aro.a($$0.a, $$1, fph.class);
   }

   public static fph a(fph.a $$0, JsonElement $$1) {
      return (fph)$$0.a.fromJson($$1, fph.class);
   }

   public fph(Map<String, fpo> $$0, fpt $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fph(List<fph> $$0) {
      fph $$1 = null;

      for (fph $$2 : $$0) {
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
   public fpo b(String $$0) {
      fpo $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fph.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fph $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fpo> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fpo> b() {
      Set<fpo> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fpt d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fph.class, new fph.b())
         .registerTypeAdapter(fpp.class, new fpp.a())
         .registerTypeAdapter(fpo.class, new fpo.a())
         .registerTypeAdapter(fpt.class, new fpt.a(this))
         .registerTypeAdapter(fpv.class, new fpv.a())
         .create();
      private dfk<csv, dfj> b;

      public dfk<csv, dfj> a() {
         return this.b;
      }

      public void a(dfk<csv, dfj> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fph> {
      public fph a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fpo> $$4 = this.a($$2, $$3);
         fpt $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fph($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fpo> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fpo> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = aro.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fpo)$$0.deserialize($$4.getValue(), fpo.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fpt b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = aro.v($$1, "multipart");
            return (fpt)$$0.deserialize($$2, fpt.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
