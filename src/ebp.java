import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ebp extends eay {
   final Map<bey, edf> a;

   ebp(eck[] $$0, Map<bey, edf> $$1) {
      super($$0);
      this.a = ImmutableMap.copyOf($$1);
   }

   @Override
   public eba b() {
      return ebb.m;
   }

   @Override
   public Set<ebt<?>> a() {
      return this.a.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      if ($$0.a(cgc.va) && !this.a.isEmpty()) {
         apf $$2 = $$1.b();
         int $$3 = $$2.a(this.a.size());
         Entry<bey, edf> $$4 = (Entry<bey, edf>)Iterables.get(this.a.entrySet(), $$3);
         bey $$5 = $$4.getKey();
         int $$6 = $$4.getValue().a($$1);
         if (!$$5.a()) {
            $$6 *= 20;
         }

         chj.a($$0, $$5, $$6);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ebp.a c() {
      return new ebp.a();
   }

   public static class a extends eay.a<ebp.a> {
      private final Map<bey, edf> a = Maps.newLinkedHashMap();

      protected ebp.a a() {
         return this;
      }

      public ebp.a a(bey $$0, edf $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eaz b() {
         return new ebp(this.g(), this.a);
      }
   }

   public static class b extends eay.c<ebp> {
      public void a(JsonObject $$0, ebp $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.a.isEmpty()) {
            JsonArray $$3 = new JsonArray();

            for (bey $$4 : $$1.a.keySet()) {
               JsonObject $$5 = new JsonObject();
               acq $$6 = jb.e.b($$4);
               if ($$6 == null) {
                  throw new IllegalArgumentException("Don't know how to serialize mob effect " + $$4);
               }

               $$5.add("type", new JsonPrimitive($$6.toString()));
               $$5.add("duration", $$2.serialize($$1.a.get($$4)));
               $$3.add($$5);
            }

            $$0.add("effects", $$3);
         }
      }

      public ebp a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         Map<bey, edf> $$3 = Maps.newLinkedHashMap();
         if ($$0.has("effects")) {
            for (JsonElement $$5 : aor.v($$0, "effects")) {
               String $$6 = aor.i($$5.getAsJsonObject(), "type");
               bey $$7 = jb.e.b(new acq($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + $$6 + "'"));
               edf $$8 = aor.a($$5.getAsJsonObject(), "duration", $$1, edf.class);
               $$3.put($$7, $$8);
            }
         }

         return new ebp($$2, $$3);
      }
   }
}
