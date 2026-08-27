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

public class fpc {
   private final Map<String, fpj> a = Maps.newLinkedHashMap();
   private fpo b;

   public static fpc a(fpc.a $$0, Reader $$1) {
      return arj.a($$0.a, $$1, fpc.class);
   }

   public static fpc a(fpc.a $$0, JsonElement $$1) {
      return (fpc)$$0.a.fromJson($$1, fpc.class);
   }

   public fpc(Map<String, fpj> $$0, fpo $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fpc(List<fpc> $$0) {
      fpc $$1 = null;

      for (fpc $$2 : $$0) {
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
   public fpj b(String $$0) {
      fpj $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fpc.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fpc $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fpj> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fpj> b() {
      Set<fpj> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fpo d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fpc.class, new fpc.b())
         .registerTypeAdapter(fpk.class, new fpk.a())
         .registerTypeAdapter(fpj.class, new fpj.a())
         .registerTypeAdapter(fpo.class, new fpo.a(this))
         .registerTypeAdapter(fpq.class, new fpq.a())
         .create();
      private dff<csq, dfe> b;

      public dff<csq, dfe> a() {
         return this.b;
      }

      public void a(dff<csq, dfe> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fpc> {
      public fpc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fpj> $$4 = this.a($$2, $$3);
         fpo $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fpc($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fpj> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fpj> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = arj.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fpj)$$0.deserialize($$4.getValue(), fpj.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fpo b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = arj.v($$1, "multipart");
            return (fpo)$$0.deserialize($$2, fpo.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
