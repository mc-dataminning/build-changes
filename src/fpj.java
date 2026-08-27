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

public class fpj {
   private final Map<String, fpq> a = Maps.newLinkedHashMap();
   private fpv b;

   public static fpj a(fpj.a $$0, Reader $$1) {
      return arp.a($$0.a, $$1, fpj.class);
   }

   public static fpj a(fpj.a $$0, JsonElement $$1) {
      return (fpj)$$0.a.fromJson($$1, fpj.class);
   }

   public fpj(Map<String, fpq> $$0, fpv $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fpj(List<fpj> $$0) {
      fpj $$1 = null;

      for (fpj $$2 : $$0) {
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
   public fpq b(String $$0) {
      fpq $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fpj.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fpj $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fpq> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fpq> b() {
      Set<fpq> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fpv d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fpj.class, new fpj.b())
         .registerTypeAdapter(fpr.class, new fpr.a())
         .registerTypeAdapter(fpq.class, new fpq.a())
         .registerTypeAdapter(fpv.class, new fpv.a(this))
         .registerTypeAdapter(fpx.class, new fpx.a())
         .create();
      private dfm<csx, dfl> b;

      public dfm<csx, dfl> a() {
         return this.b;
      }

      public void a(dfm<csx, dfl> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fpj> {
      public fpj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fpq> $$4 = this.a($$2, $$3);
         fpv $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fpj($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fpq> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fpq> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = arp.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fpq)$$0.deserialize($$4.getValue(), fpq.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fpv b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = arp.v($$1, "multipart");
            return (fpv)$$0.deserialize($$2, fpv.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
