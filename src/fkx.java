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

public class fkx {
   private final Map<String, fle> a = Maps.newLinkedHashMap();
   private flj b;

   public static fkx a(fkx.a $$0, Reader $$1) {
      return aor.a($$0.a, $$1, fkx.class);
   }

   public static fkx a(fkx.a $$0, JsonElement $$1) {
      return (fkx)$$0.a.fromJson($$1, fkx.class);
   }

   public fkx(Map<String, fle> $$0, flj $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fkx(List<fkx> $$0) {
      fkx $$1 = null;

      for (fkx $$2 : $$0) {
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
   public fle b(String $$0) {
      fle $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fkx.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fkx $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fle> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fle> b() {
      Set<fle> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public flj d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fkx.class, new fkx.b())
         .registerTypeAdapter(flf.class, new flf.a())
         .registerTypeAdapter(fle.class, new fle.a())
         .registerTypeAdapter(flj.class, new flj.a(this))
         .registerTypeAdapter(fll.class, new fll.a())
         .create();
      private dcc<cpn, dcb> b;

      public dcc<cpn, dcb> a() {
         return this.b;
      }

      public void a(dcc<cpn, dcb> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fkx> {
      public fkx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fle> $$4 = this.a($$2, $$3);
         flj $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fkx($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fle> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fle> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = aor.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fle)$$0.deserialize($$4.getValue(), fle.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected flj b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = aor.v($$1, "multipart");
            return (flj)$$0.deserialize($$2, flj.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
