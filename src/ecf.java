import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class ecf implements eck {
   final Map<String, dzj> a;
   final dzk.b b;

   ecf(Map<String, dzj> $$0, dzk.b $$1) {
      this.a = ImmutableMap.copyOf($$0);
      this.b = $$1;
   }

   @Override
   public ecl b() {
      return ecm.h;
   }

   @Override
   public Set<ebt<?>> a() {
      return Stream.concat(Stream.of(this.b.a()), this.a.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(dzk $$0) {
      bfj $$1 = $$0.c(this.b.a());
      if ($$1 == null) {
         return false;
      } else {
         efg $$2 = $$1.dI().I();

         for (Entry<String, dzj> $$3 : this.a.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(dzk $$0, bfj $$1, efg $$2, String $$3, dzj $$4) {
      efd $$5 = $$2.d($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cv();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static ecf.a a(dzk.b $$0) {
      return new ecf.a($$0);
   }

   public static class a implements eck.a {
      private final Map<String, dzj> a = Maps.newHashMap();
      private final dzk.b b;

      public a(dzk.b $$0) {
         this.b = $$0;
      }

      public ecf.a a(String $$0, dzj $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eck build() {
         return new ecf(this.a, this.b);
      }
   }

   public static class b implements dzt<ecf> {
      public void a(JsonObject $$0, ecf $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();

         for (Entry<String, dzj> $$4 : $$1.a.entrySet()) {
            $$3.add($$4.getKey(), $$2.serialize($$4.getValue()));
         }

         $$0.add("scores", $$3);
         $$0.add("entity", $$2.serialize($$1.b));
      }

      public ecf b(JsonObject $$0, JsonDeserializationContext $$1) {
         Set<Entry<String, JsonElement>> $$2 = aor.u($$0, "scores").entrySet();
         Map<String, dzj> $$3 = Maps.newLinkedHashMap();

         for (Entry<String, JsonElement> $$4 : $$2) {
            $$3.put($$4.getKey(), aor.a($$4.getValue(), "score", $$1, dzj.class));
         }

         return new ecf($$3, aor.a($$0, "entity", $$1, dzk.b.class));
      }
   }
}
