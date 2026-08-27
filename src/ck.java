import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ck {
   public static final ck a = new ck(Collections.emptyMap());
   private final Map<bey, ck.a> b;

   public ck(Map<bey, ck.a> $$0) {
      this.b = $$0;
   }

   public static ck a() {
      return new ck(Maps.newLinkedHashMap());
   }

   public ck a(bey $$0) {
      this.b.put($$0, new ck.a());
      return this;
   }

   public ck a(bey $$0, ck.a $$1) {
      this.b.put($$0, $$1);
      return this;
   }

   public boolean a(bfj $$0) {
      if (this == a) {
         return true;
      } else {
         return $$0 instanceof bfz ? this.a(((bfz)$$0).ep()) : false;
      }
   }

   public boolean a(bfz $$0) {
      return this == a ? true : this.a($$0.ep());
   }

   public boolean a(Map<bey, bfa> $$0) {
      if (this == a) {
         return true;
      } else {
         for (Entry<bey, ck.a> $$1 : this.b.entrySet()) {
            bfa $$2 = $$0.get($$1.getKey());
            if (!$$1.getValue().a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   public static ck a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = aor.m($$0, "effects");
         Map<bey, ck.a> $$2 = Maps.newLinkedHashMap();

         for (Entry<String, JsonElement> $$3 : $$1.entrySet()) {
            acq $$4 = new acq($$3.getKey());
            bey $$5 = jb.e.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + $$4 + "'"));
            ck.a $$6 = ck.a.a(aor.m($$3.getValue(), $$3.getKey()));
            $$2.put($$5, $$6);
         }

         return new ck($$2);
      } else {
         return a;
      }
   }

   public JsonElement b() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();

         for (Entry<bey, ck.a> $$1 : this.b.entrySet()) {
            $$0.add(jb.e.b($$1.getKey()).toString(), $$1.getValue().a());
         }

         return $$0;
      }
   }

   public static class a {
      private final cj.d a;
      private final cj.d b;
      @Nullable
      private final Boolean c;
      @Nullable
      private final Boolean d;

      public a(cj.d $$0, cj.d $$1, @Nullable Boolean $$2, @Nullable Boolean $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public a() {
         this(cj.d.e, cj.d.e, null, null);
      }

      public boolean a(@Nullable bfa $$0) {
         if ($$0 == null) {
            return false;
         } else if (!this.a.d($$0.e())) {
            return false;
         } else if (!this.b.d($$0.d())) {
            return false;
         } else {
            return this.c != null && this.c != $$0.f() ? false : this.d == null || this.d == $$0.g();
         }
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         $$0.add("amplifier", this.a.d());
         $$0.add("duration", this.b.d());
         $$0.addProperty("ambient", this.c);
         $$0.addProperty("visible", this.d);
         return $$0;
      }

      public static ck.a a(JsonObject $$0) {
         cj.d $$1 = cj.d.a($$0.get("amplifier"));
         cj.d $$2 = cj.d.a($$0.get("duration"));
         Boolean $$3 = $$0.has("ambient") ? aor.k($$0, "ambient") : null;
         Boolean $$4 = $$0.has("visible") ? aor.k($$0, "visible") : null;
         return new ck.a($$1, $$2, $$3, $$4);
      }
   }
}
