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

public class efc implements efh {
   final Map<String, ecg> a;
   final ech.b b;

   efc(Map<String, ecg> $$0, ech.b $$1) {
      this.a = ImmutableMap.copyOf($$0);
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.h;
   }

   @Override
   public Set<eeq<?>> a() {
      return Stream.concat(Stream.of(this.b.a()), this.a.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ech $$0) {
      big $$1 = $$0.c(this.b.a());
      if ($$1 == null) {
         return false;
      } else {
         eie $$2 = $$1.dK().I();

         for (Entry<String, ecg> $$3 : this.a.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ech $$0, big $$1, eie $$2, String $$3, ecg $$4) {
      eib $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cx();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static efc.a a(ech.b $$0) {
      return new efc.a($$0);
   }

   public static class a implements efh.a {
      private final Map<String, ecg> a = Maps.newHashMap();
      private final ech.b b;

      public a(ech.b $$0) {
         this.b = $$0;
      }

      public efc.a a(String $$0, ecg $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public efh build() {
         return new efc(this.a, this.b);
      }
   }

   public static class b implements ecq<efc> {
      public void a(JsonObject $$0, efc $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();

         for (Entry<String, ecg> $$4 : $$1.a.entrySet()) {
            $$3.add($$4.getKey(), $$2.serialize($$4.getValue()));
         }

         $$0.add("scores", $$3);
         $$0.add("entity", $$2.serialize($$1.b));
      }

      public efc b(JsonObject $$0, JsonDeserializationContext $$1) {
         Set<Entry<String, JsonElement>> $$2 = arf.u($$0, "scores").entrySet();
         Map<String, ecg> $$3 = Maps.newLinkedHashMap();

         for (Entry<String, JsonElement> $$4 : $$2) {
            $$3.put($$4.getKey(), arf.a($$4.getValue(), "score", $$1, ecg.class));
         }

         return new efc($$3, arf.a($$0, "entity", $$1, ech.b.class));
      }
   }
}
