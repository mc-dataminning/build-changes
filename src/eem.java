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

public class eem extends edv {
   final Map<bhr, egc> a;

   eem(efh[] $$0, Map<bhr, egc> $$1) {
      super($$0);
      this.a = ImmutableMap.copyOf($$1);
   }

   @Override
   public edx b() {
      return edy.m;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if ($$0.a(ciz.va) && !this.a.isEmpty()) {
         art $$2 = $$1.b();
         int $$3 = $$2.a(this.a.size());
         Entry<bhr, egc> $$4 = (Entry<bhr, egc>)Iterables.get(this.a.entrySet(), $$3);
         bhr $$5 = $$4.getKey();
         int $$6 = $$4.getValue().a($$1);
         if (!$$5.a()) {
            $$6 *= 20;
         }

         ckg.a($$0, $$5, $$6);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eem.a c() {
      return new eem.a();
   }

   public static class a extends edv.a<eem.a> {
      private final Map<bhr, egc> a = Maps.newLinkedHashMap();

      protected eem.a a() {
         return this;
      }

      public eem.a a(bhr $$0, egc $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public edw b() {
         return new eem(this.g(), this.a);
      }
   }

   public static class b extends edv.c<eem> {
      public void a(JsonObject $$0, eem $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.a.isEmpty()) {
            JsonArray $$3 = new JsonArray();

            for (bhr $$4 : $$1.a.keySet()) {
               JsonObject $$5 = new JsonObject();
               aep $$6 = jc.e.b($$4);
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

      public eem a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         Map<bhr, egc> $$3 = Maps.newLinkedHashMap();
         if ($$0.has("effects")) {
            for (JsonElement $$5 : arf.v($$0, "effects")) {
               String $$6 = arf.i($$5.getAsJsonObject(), "type");
               bhr $$7 = jc.e.b(new aep($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + $$6 + "'"));
               egc $$8 = arf.a($$5.getAsJsonObject(), "duration", $$1, egc.class);
               $$3.put($$7, $$8);
            }
         }

         return new eem($$2, $$3);
      }
   }
}
