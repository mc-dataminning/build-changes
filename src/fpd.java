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

public class fpd {
   private final Map<String, fpk> a = Maps.newLinkedHashMap();
   private fpp b;

   public static fpd a(fpd.a $$0, Reader $$1) {
      return arr.a($$0.a, $$1, fpd.class);
   }

   public static fpd a(fpd.a $$0, JsonElement $$1) {
      return (fpd)$$0.a.fromJson($$1, fpd.class);
   }

   public fpd(Map<String, fpk> $$0, fpp $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fpd(List<fpd> $$0) {
      fpd $$1 = null;

      for (fpd $$2 : $$0) {
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
   public fpk b(String $$0) {
      fpk $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fpd.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fpd $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fpk> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fpk> b() {
      Set<fpk> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fpp d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fpd.class, new fpd.b())
         .registerTypeAdapter(fpl.class, new fpl.a())
         .registerTypeAdapter(fpk.class, new fpk.a())
         .registerTypeAdapter(fpp.class, new fpp.a(this))
         .registerTypeAdapter(fpr.class, new fpr.a())
         .create();
      private dfe<ctc, dfd> b;

      public dfe<ctc, dfd> a() {
         return this.b;
      }

      public void a(dfe<ctc, dfd> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fpd> {
      public fpd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fpk> $$4 = this.a($$2, $$3);
         fpp $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fpd($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fpk> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fpk> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = arr.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fpk)$$0.deserialize($$4.getValue(), fpk.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fpp b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = arr.v($$1, "multipart");
            return (fpp)$$0.deserialize($$2, fpp.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
