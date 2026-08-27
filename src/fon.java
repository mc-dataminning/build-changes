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

public class fon {
   private final Map<String, fov> a = Maps.newLinkedHashMap();
   private fpa b;

   public static fon a(fon.a $$0, Reader $$1) {
      return arg.a($$0.a, $$1, fon.class);
   }

   public static fon a(fon.a $$0, JsonElement $$1) {
      return (fon)$$0.a.fromJson($$1, fon.class);
   }

   public fon(Map<String, fov> $$0, fpa $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fon(List<fon> $$0) {
      fon $$1 = null;

      for (fon $$2 : $$0) {
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
   public fov b(String $$0) {
      fov $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fon.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fon $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fov> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fov> b() {
      Set<fov> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fpa d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fon.class, new fon.b())
         .registerTypeAdapter(fow.class, new fow.a())
         .registerTypeAdapter(fov.class, new fov.a())
         .registerTypeAdapter(fpa.class, new fpa.a(this))
         .registerTypeAdapter(fpc.class, new fpc.a())
         .create();
      private dfb<csm, dfa> b;

      public dfb<csm, dfa> a() {
         return this.b;
      }

      public void a(dfb<csm, dfa> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fon> {
      public fon a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fov> $$4 = this.a($$2, $$3);
         fpa $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fon($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fov> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fov> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = arg.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fov)$$0.deserialize($$4.getValue(), fov.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fpa b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = arg.v($$1, "multipart");
            return (fpa)$$0.deserialize($$2, fpa.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
